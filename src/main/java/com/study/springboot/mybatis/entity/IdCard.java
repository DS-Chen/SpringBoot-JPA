package com.study.springboot.mybatis.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedEntityGraphs;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author chendongsuo
 * @create 2018-06-13 10:19
 * @email dongsuo.chen@nvr-china.com
 * @description 身份证实体
 */
@Entity
@Table(name = "idcard")
public class IdCard {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id" )
    private Integer id;

    @Column(name = "num" )
    private String num;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "idcard")
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
