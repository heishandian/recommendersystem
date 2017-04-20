package com.huangkai.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.huangkai.model.Movie_genres;
import com.huangkai.model.User;
import com.huangkai.service.IUserRegisterService;
import com.huangkai.service.IUserService;
import com.huangkai.util.JsonMessage;

@Controller
@RequestMapping("/user")
public class UserLoginController {
	@Resource
	IUserService userService;// 用接口去操作实现类
	@Resource
	IUserRegisterService userRegisterService;

	@RequestMapping("/gotoLoginPage.do")
	public String gotoLoginPage(HttpServletRequest request,
			HttpServletResponse response) {
		return "login";
	}

	@RequestMapping("/gotoindexPage.do")
	public String gotoIndexPage(HttpServletRequest request,HttpServletResponse response) {
		return "index";
	}

	@RequestMapping("/gotoRegisterPage.do")
	public String gotoRegisterPage(HttpServletRequest request,HttpServletResponse response,Model model) {
		List<Movie_genres> movie_genres = userRegisterService.getAllMovie_genres(); 
		model.addAttribute("movie_genres",movie_genres);
		//String path = request.getServletContext().getContextPath();
		String path = request.getServletPath();
		System.out.println(path);
		//String path2 = request.getServletContext().getRealPath(path);
		//System.out.println(path);
		//System.out.println(path2);
		return "register";
	}

	
	@RequestMapping("/Userlogin.do")
	public void Userlogin(@RequestBody User user, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// 从数据库中讲用户名和密码查出来和页面上传过来的用户名和密码对比，如果一直则进入主页，不一致重定向到登陆页面
		boolean chekboxState = user.getCheckboxstate();
		//如果checkbox被选中了，那么将用户名和密码写入cookie
		if (chekboxState) {
			Cookie usernameCookie = new Cookie("username",user.getUsername());
			Cookie userpasswordCookie = new Cookie("userpassword",user.getPassword());
			usernameCookie.setMaxAge(1000);
			userpasswordCookie.setMaxAge(1000);
			response.addCookie(usernameCookie);
			response.addCookie(userpasswordCookie);
		}

		User user_database = userService.selectByUsername(user.getUsername());
		JsonMessage jsonMessage = null;
		if (user.equals(user_database)) {
			jsonMessage = new JsonMessage();
			jsonMessage.setKey("pass");
		} else {
			jsonMessage = new JsonMessage();
			jsonMessage.setKey("failed");
		}
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/json");
		response.getWriter().write(JSON.toJSONString(jsonMessage));
	}

}
