package com.zlz.common.util;

import com.zlz.common.entity.user.UserInfo;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhulinzhong
 * @version 1.0 createTime:2019/9/27 15:39
 */
public class LoginUserUtil {

    /**
     * 获取登陆人信息
     * @param request
     * @return
     */
    public static UserInfo getLoginUser(HttpServletRequest request){

        //HttpSession session = request.getSession();
        //UserInfo loginUser = (UserInfo) session.getAttribute("loginUser");

        UserInfo loginUser = new UserInfo();

        loginUser.setId(1210175012L);
        loginUser.setAuthority(1);

        return loginUser;
    }
}
