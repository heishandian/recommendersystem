package com.huangkai.service;

import com.huangkai.model.User;

public interface IUserService {

    User selectByPrimaryKey(Integer userid);
    User selectByUsername(String name);

}
