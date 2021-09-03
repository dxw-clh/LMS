package com.dxw.service;

import com.dxw.pojo.User;

public interface UserService {

    //通过用户名查询用户
    User queryUserByName(String name);
}
