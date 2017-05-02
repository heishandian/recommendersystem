package com.huangkai.test;

import java.util.Scanner;
import java.util.Stack;

public class TestStack {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        System.out.println(resolve(input));
    }

    private static int resolve(String data){
        Stack<String> stack = new Stack<String>();
        String a;
        String b;
        String[] dataStrs = data.split(" ");
        for (String dataStr : dataStrs)
            if (!"*".equals(dataStr) && !"+".equals(dataStr)) {
                stack.push(dataStr);
            } else if ("*".equals(dataStr)) {
                try {
                    a = stack.pop();
                    b = stack.pop();
                } catch (Exception e) {
                    return -1;//向下溢出
                }
                try {
                    stack.push(String.valueOf(Integer.parseInt(a) * Integer.parseInt(b)));
                } catch (StackOverflowError e) {
                    return 2;//向上一出
                }

            } else {
                try {
                    a = stack.pop();
                    b = stack.pop();
                } catch (Exception e) {
                    return -1;
                }
                try {
                    stack.push(String.valueOf(Integer.parseInt(a) + Integer.parseInt(b)));
                } catch (Exception e) {
                    return 2;
                }

            }
        return Integer.valueOf(stack.pop());
    }


}
