package com.study.springboot.mybatis.dao;

import com.study.springboot.mybatis.entity.Role;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.util.List;

/**
 * @author chendongsuo
 * @create 2018-06-15 11:31
 * @email dongsuo.chen@nvr-china.com
 * @description 角色dto
 */
public interface RoleDao extends
        Serializable,
        JpaRepository<Role,Integer>,
        JpaSpecificationExecutor<Role>{

    @Query(value = "select r.*  from role r LEFT JOIN user_role ur ON r.id=ur.r_id LEFT JOIN user u on ur.u_id= u.id where u.name=?1 ",nativeQuery = true)
    List<Role> withByRoleName(String name);
}
