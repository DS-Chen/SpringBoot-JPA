package com.study.springboot.mybatis.entity;

import java.util.Date;

import javax.xml.crypto.Data;

/**
 * @author chendongsuo
 * @create 2018-06-08 17:15
 * @email dongsuo.chen@nvr-china.com
 * @description 学生实体和课程实体的公共实体
 */

public class StudentCourse {

    private Student student;
    private Course course;
    private Date date;

    public StudentCourse() {
    }

    public StudentCourse(Student student, Course course, Date date) {
        this.student = student;
        this.course = course;
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
