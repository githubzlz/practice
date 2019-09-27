package com.zlz.blog.controller;

import com.zlz.blog.service.BlogService;
import com.zlz.common.entity.user.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhulinzhong
 * @version 1.0 createTime:2019/9/27 14:28
 */
@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/findUserInfo/{id}")
    public UserInfo findUserInfo(@PathVariable("id") Long id){

        UserInfo user = blogService.getUserInfo(id);

        System.err.println(user);

        return user;
    }
}
