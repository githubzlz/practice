package com.zlz.blog.service;

import com.zlz.userserver.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author zhulinzhong
 * @version 1.0 createTime:2019/9/27 14:19
 */
@FeignClient(name = "USER")
public interface BlogService {

    /**
     * 通过USER的接口获取user对象
     * @param id id
     * @return user的信息
     */
    @PostMapping("/user/getUserInfo/{id}")
    User getUserInfo(@PathVariable("id") Long id);
}
