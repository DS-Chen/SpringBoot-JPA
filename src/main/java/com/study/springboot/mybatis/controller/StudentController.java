package com.study.springboot.mybatis.controller;

import com.study.springboot.mybatis.mapper.StudentAllMapper;
import com.study.springboot.mybatis.mapper.StudentMapper;
import com.study.springboot.mybatis.vo.DataResponseVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chendongsuo
 * @create 2018-06-08 17:33
 * @email dongsuo.chen@nvr-china.com
 * @description 学生Controller
 */
@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private StudentAllMapper studentAllMapper;

    /**
     * 学生课程信息多对多
     */
    @RequestMapping(value = "/info", method = RequestMethod.GET, produces = {"application/json"})
    public DataResponseVo getStudentInfo() {
        return new DataResponseVo(0, studentMapper.selectStudentCourse());
    }

    /**
     * 全部关于学生的信息
     */
    @RequestMapping(value = "/linktable", method = RequestMethod.GET, produces = {"application/json"})
    public DataResponseVo getlinkTableSel(@RequestParam(value = "id", required = true) Integer id) {
        return new DataResponseVo(0, studentAllMapper.linkTableSel(id));
    }

}
