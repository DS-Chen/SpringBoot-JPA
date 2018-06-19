package com.study.springboot.mybatis.service;

import com.study.springboot.mybatis.entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {

  List<User> getSingleUser(String name,String subname);

  int updateUser(int id,String name,String pwd,String tel);

  int deleteUser(int id);
}
