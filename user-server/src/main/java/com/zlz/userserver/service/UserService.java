package com.zlz.userserver.service;

import com.zlz.common.entity.user.UserInfo;
import com.zlz.common.util.ResultSet;

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
    ResultSet createUser(UserInfo userInfo);

    /**
     * 修改用户信息
     * @param userInfo
     * @return
     */
    ResultSet updateUserInfo(UserInfo userInfo);
}
