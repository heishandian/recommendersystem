package com.huangkai.dao;

import com.huangkai.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);
   
    User selectByUsername(String name);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}