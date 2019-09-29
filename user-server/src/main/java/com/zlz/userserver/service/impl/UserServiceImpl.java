package com.zlz.userserver.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zlz.common.constant.AuthorityConstant;
import com.zlz.common.constant.DeleteStateConstant;
import com.zlz.common.constant.ResultStateConstant;
import com.zlz.common.util.PageInfo;
import com.zlz.common.entity.user.UserInfo;
import com.zlz.common.util.LoginUserUtil;
import com.zlz.common.util.PageUtil;
import com.zlz.common.util.ThrowExceptionUtil;
import com.zlz.userserver.exception.InfoNumberException;
import com.zlz.userserver.exception.ResultRowErrorException;
import com.zlz.userserver.exception.UpdateUserInfoException;
import com.zlz.userserver.mapper.UserMapper;
import com.zlz.userserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @author zhulinzhong
 * @version 1.0 createTime:2019/9/27 16:29
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void createUser(UserInfo userInfo) {

        ThrowExceptionUtil.throwNullInputDateException(userInfo);

        //补全数据
        userInfo.setAuthority(AuthorityConstant.USER_NORMAL);
        userInfo.setCreatedUser(userInfo.getId().toString());
        userInfo.setCreatedTime(new Date());
        userInfo.setLastModifiedUser(userInfo.getId().toString());
        userInfo.setLastModifiedTime(new Date());
        userInfo.setIsDeleted(DeleteStateConstant.IS_NOT_DELETED);
        int row = userMapper.insert(userInfo);
        rowErrorThrowException(row);
    }

    @Override
    public void updateUserInfo(UserInfo userInfo, HttpServletRequest request) {

        ThrowExceptionUtil.throwNullInputDateException(userInfo,userInfo.getId());
        UserInfo loginUser = LoginUserUtil.getLoginUser(request);
        Long loginId = loginUser.getId();

        if(userInfo.getId().equals(loginId)){
            throw new UpdateUserInfoException("登录用户与修改用户不统一");
        }

        //补全信息
        userInfo.setLastModifiedUser(loginUser.getId().toString());
        userInfo.setLastModifiedTime(new Date());

        int row = userMapper.update(userInfo, null);
        rowErrorThrowException(row);
    }

    @Override
    public List<UserInfo> getList(PageInfo pageInfo) {

        ThrowExceptionUtil.throwNullInputDateException(pageInfo);

        IPage<UserInfo> iPage = userMapper.selectPage(PageUtil.getPage(pageInfo), null);
        List<UserInfo> list = iPage.getRecords();
        return list;
    }

    @Override
    public List<UserInfo> getListByType(PageInfo pageInfo, Integer type) {

        ThrowExceptionUtil.throwNullInputDateException(pageInfo,type);

        QueryWrapper<UserInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("authority", type);
        IPage<UserInfo> iPage = userMapper.selectPage(PageUtil.getPage(pageInfo),wrapper);
        List<UserInfo> list = iPage.getRecords();

        infoNumberErrorThrowException(list);

        return list;
    }

    /**
     * 判断返回行数是否正确，错误时抛出异常
     * @param row
     */
    private void rowErrorThrowException(int row){
        if(row != ResultStateConstant.SUCCESS_RESULT_STATE){
            throw new ResultRowErrorException("返回了错误的修改数量，请联系管理员");
        }
    }

    /**
     * 判断用户实体为空或者数组为空时抛出异常
     * @param object
     */
    private void infoNumberErrorThrowException(Object object){

        if(object == null){
            throw new InfoNumberException("没有用户信息返回");
        }

        if(object instanceof List && ((List) object).size() == 0){
            throw new InfoNumberException("没有用户信息返回");
        }
    }


}
