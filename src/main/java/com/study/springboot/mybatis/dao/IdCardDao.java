package com.study.springboot.mybatis.dao;

import com.study.springboot.mybatis.entity.IdCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface IdCardDao extends
        Serializable,
        JpaRepository<IdCard, Integer>,
        JpaSpecificationExecutor<IdCard> {
}
