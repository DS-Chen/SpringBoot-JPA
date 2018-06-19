package com.study.springboot.mybatis.entity;

/**
 * @author chendongsuo
 * @create 2018-06-11 9:13
 * @email dongsuo.chen@nvr-china.com
 * @description 班主任表实体
 */
public class HeadTecher {

    private Integer tid;
    private String tname;
    private Integer tage;

    public HeadTecher() {
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getTage() {
        return tage;
    }

    public void setTage(Integer tage) {
        this.tage = tage;
    }
}
