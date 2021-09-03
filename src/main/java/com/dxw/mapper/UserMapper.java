package com.dxw.mapper;

import com.dxw.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    //通过用户名查询用户
    User queryUserByName(@Param("username") String name);

}
