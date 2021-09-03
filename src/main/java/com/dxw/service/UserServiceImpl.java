package com.dxw.service;

import com.dxw.mapper.UserMapper;
import com.dxw.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User queryUserByName(String name) {
        return userMapper.queryUserByName(name);
    }
}
