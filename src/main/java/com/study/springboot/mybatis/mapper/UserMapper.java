package com.study.springboot.mybatis.mapper;

import com.study.springboot.mybatis.entity.User;

import org.springframework.stereotype.Component;

@Component
public interface UserMapper  {

    int insert(User record);
}
