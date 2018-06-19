package com.study.springboot.mybatis.dao;

import com.study.springboot.mybatis.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.util.List;

public interface UserDao extends
        Serializable,
        JpaRepository<User, Integer>,
        JpaSpecificationExecutor<User> {

    /**
     * 查询用户信息
     * @param name
     * @param subname
     * @return
     */
    List<User> findByNameOrSubname(String name,String subname);

    /**
     * 更新用户信息 byid
     * @param id
     * @param name
     * @param pwd
     * @param tel
     * @return
     */
    @Modifying
    @Query("update User as u set u.name= ?2, u.password= ?3 , u.telephone= ?4 where u.id= ?1")
    int updateById(int id, String name, String pwd, String tel);

    /**
     * 删除用户byid
     * @param id
     * @return
     */
    int deleteUserById(int id);
}