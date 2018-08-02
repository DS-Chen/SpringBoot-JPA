package com.study.springboot.mybatis.controller;

import com.study.springboot.mybatis.dao.AddressDao;
import com.study.springboot.mybatis.dao.IdCardDao;
import com.study.springboot.mybatis.dao.RoleDao;
import com.study.springboot.mybatis.dao.UserDao;
import com.study.springboot.mybatis.entity.Address;
import com.study.springboot.mybatis.entity.IdCard;
import com.study.springboot.mybatis.entity.User;
import com.study.springboot.mybatis.service.UserService;
import com.study.springboot.mybatis.vo.DataResponseVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private IdCardDao idCardDao;

    @Autowired
    private AddressDao addressDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private UserService userService;

    /**
     * 查询单一用户
     */
    @RequestMapping(value = "/singleuser", method = RequestMethod.GET, produces = {"application/json"})
    public List<User> getSingleUser(@RequestParam(value = "name", required = false) String name,
                                    @RequestParam(value = "subname", required = false) String subname) {
        return userService.getSingleUser(name, subname);
    }

    /**
     * 查询所有用户信息
     */
    @RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = {"application/json"})
    public DataResponseVo findAllUser() {
        List<User> users = userDao.findAll();
        return new DataResponseVo(0, users);
    }

    /**
     * 插入用户地址
     */
    @RequestMapping(value = "/insertAddress", method = RequestMethod.POST, produces = {"application/json"})
    public DataResponseVo insertAddress(@RequestBody Address address) {
        address.getAddress();
        return new DataResponseVo(0, addressDao.saveAndFlush(address));
    }

    /**
     * 插入身份证号
     */
    @RequestMapping(value = "/insertIdcard", method = RequestMethod.POST, produces = {"application/json"})
    public DataResponseVo insertIdCard(@RequestBody IdCard idCard) {
        idCard.getNum();
        return new DataResponseVo(0, idCardDao.saveAndFlush(idCard));
    }

    /**
     * 插入新用户信息
     */
    @RequestMapping(value = "/insertUser", method = RequestMethod.POST, produces = {"application/json"})
    public DataResponseVo insertUser(@RequestBody User user) {
        user.getName();
        user.getSubname();
        user.getPassword();
        user.getTelephone();
        user.getIdcard();
        user.getRoles();
        user.getAddresses();
        user.getRoles();
        return new DataResponseVo(0, userDao.saveAndFlush(user));
    }

    /**
     * 查询用户信息byid
     */
    @RequestMapping(value = "/findUserInfoById", method = RequestMethod.GET, produces = {"application/json"})
    public DataResponseVo findUserInfoById(@RequestParam(value = "id") Integer id) {
        return new DataResponseVo(0, userDao.findById(id));
    }

    /**
     * 获取角色
     */
    @RequestMapping(value = "/findRole", method = RequestMethod.GET, produces = {"application/json"})
    public DataResponseVo findRoleInfo(@RequestParam(value = "name", required = true) String name) {
        return new DataResponseVo(0, roleDao.withByRoleName(name));

    }

    /**
     * 更新用户信息
     */
    @RequestMapping(value = "/updateUserInfo", method = RequestMethod.GET, produces = {"application/json"})
    public DataResponseVo updateUserInfo(@RequestParam(value = "id") Integer id,
                                         @RequestParam(value = "name") String name,
                                         @RequestParam(value = "password") String password,
                                         @RequestParam(value = "telephone") String telephone) {
        userService.updateUser(id, name, password, telephone);
        return new DataResponseVo(0, "更新成功");
    }

    /**
     * 删除用户
     */
    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET, produces = {"application/json"})
    public DataResponseVo DeleteUser(@RequestParam(value = "id") Integer id) {
        userService.deleteUser(id);
        return new DataResponseVo(0, "删除成功");
    }
}