package com.study.springboot.mybatis.entity;

import java.util.List;

import javax.swing.plaf.PanelUI;

/**
 * @author chendongsuo
 * @create 2018-06-11 9:13
 * @email dongsuo.chen@nvr-china.com
 * @description 班级实体表
 */
public class HeadClass {
    private Integer cid;
    private String cname;
    private HeadTecher headTecher;//用于一对一

    private List<Student> students;//用于一对多

    public HeadClass() {
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public HeadTecher getHeadTecher() {
        return headTecher;
    }

    public void setHeadTecher(HeadTecher headTecher) {
        this.headTecher = headTecher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
