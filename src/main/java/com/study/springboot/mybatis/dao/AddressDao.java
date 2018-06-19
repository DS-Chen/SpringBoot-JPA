package com.study.springboot.mybatis.dao;

import com.study.springboot.mybatis.entity.Address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author chendongsuo
 * @create 2018-06-15 9:35
 * @email dongsuo.chen@nvr-china.com
 * @description 用户地址dto
 */
public interface AddressDao extends
        Serializable,
        JpaRepository<Address,Integer>,
        JpaSpecificationExecutor<Address>{
}
