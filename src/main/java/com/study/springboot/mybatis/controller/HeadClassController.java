package com.study.springboot.mybatis.controller;

import com.study.springboot.mybatis.mapper.HeadClassMapper;
import com.study.springboot.mybatis.vo.DataResponseVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chendongsuo
 * @create 2018-06-11 9:56
 * @email dongsuo.chen@nvr-china.com
 * @description 班级Controller
 */
@RestController
@CrossOrigin
@RequestMapping("/headclass")
public class HeadClassController {

    @Autowired
    private HeadClassMapper headClassMapper;

    @RequestMapping(value = "/getClassInfo",method = RequestMethod.GET,produces = {"application/json"})
    public DataResponseVo getClassInfo(@RequestParam(value = "id",required = true) Integer id){
        return new DataResponseVo(0,headClassMapper.selectClassById(id));
    }

    @RequestMapping(value = "/getTecherinfo",method = RequestMethod.GET,produces = {"application/json"})
    public DataResponseVo getHeadTecher(){
        return new DataResponseVo(0,headClassMapper.getHeadTecher());
    }
    @RequestMapping(value = "/getclassandstudent",method = RequestMethod.GET,produces = {"application/json"})
    public DataResponseVo getClassAndStudent(@RequestParam(value = "id",required = true) Integer id){
        return new DataResponseVo(0,headClassMapper.selectClassAndStudentById(id));
    }
}
