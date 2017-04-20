package com.huangkai.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huangkai.dao.UserMapper;
import com.huangkai.model.User;
import com.huangkai.service.IUserService;

@Service("UserServiceImpl")
public class UserServiceImpl implements IUserService {
	@Resource
	UserMapper userMapper;

	@Override
	public User selectByPrimaryKey(Integer userid) {
		return userMapper.selectByPrimaryKey(userid);
	}

	@Override
	public User selectByUsername(String name) {
		return userMapper.selectByUsername(name);
	}
}
