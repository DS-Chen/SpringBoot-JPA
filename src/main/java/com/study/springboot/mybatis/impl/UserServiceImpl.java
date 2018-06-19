package com.study.springboot.mybatis.impl;

import com.study.springboot.mybatis.dao.UserDao;
import com.study.springboot.mybatis.entity.User;
import com.study.springboot.mybatis.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public List<User> getSingleUser(String name,String subname) {
        return userDao.findByNameOrSubname(name,subname);
    }

    @Override
    public int updateUser(int id, String name, String pwd, String tel) {
        return userDao.updateById(id,name,pwd,tel);
    }

    @Override
    public int deleteUser(int id) {
        return userDao.deleteUserById(id);
    }
}
