package com.study.springboot.mybatis.mapper;

import com.study.springboot.mybatis.entity.HeadClass;
import com.study.springboot.mybatis.entity.HeadTecher;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface HeadClassMapper {

    HeadClass selectClassById(@Param("id") Integer id);

    List<HeadTecher> getHeadTecher();

    List<HeadClass> selectClassAndStudentById(@Param("id") Integer id);
}
