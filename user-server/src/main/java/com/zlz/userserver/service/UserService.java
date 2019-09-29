package com.zlz.userserver.service;

import com.zlz.common.entity.PageInfo;
import com.zlz.common.entity.user.UserInfo;
import com.zlz.common.util.ResultSet;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author zhulinzhong
 * @version 1.0 createTime:2019/9/27 16:29
 */
public interface UserService {

    /**
     * 创建新的用户
     * @param userInfo
     * @return
     */
    void createUser(UserInfo userInfo);

    /**
     * 修改用户信息
     * @param userInfo
     * @return
     */
    void updateUserInfo(UserInfo userInfo, HttpServletRequest request);

    /**
     * 分页查询用户信息
     * @param pageInfo
     * @return
     */
    List<UserInfo> getList(PageInfo pageInfo);

    /**
     * 获取用户，根据用户类型
     * @param pageInfo
     * @param type
     * @return
     */
    List<UserInfo> getListByType(PageInfo pageInfo,Integer type);

}
