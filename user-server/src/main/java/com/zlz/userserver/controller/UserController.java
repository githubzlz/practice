package com.zlz.userserver.controller;

import com.zlz.userserver.entity.ResultSet;
import com.zlz.userserver.entity.User;
import com.zlz.userserver.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhulinzhong
 * @version 1.0 createTime:2019/9/27 10:35
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    /**
     * 获取一个用户信息
     * @param id
     * @return ResultSet
     */
    @PostMapping("getOneById/{id}")
    public ResultSet  getOneById(@PathVariable("id") Long id){
        User user = userMapper.selectById(id);
        return ResultSet.success("查询成功", user);
    }

    /**
     * 获取一个用户信息
     * @param id
     * @return
     */
    @PostMapping("getUserInfo/{id}")
    public User getUserInfo(@PathVariable("id") Long id){
        return userMapper.selectById(id);
    }

}
