package com.study.springboot.mybatis.mapper;

import com.study.springboot.mybatis.entity.Student;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {

    public List<Student> selectStudentCourse();

}
