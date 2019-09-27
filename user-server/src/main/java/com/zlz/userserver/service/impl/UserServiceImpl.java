package com.zlz.userserver.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zlz.common.constant.ResultStateConstant;
import com.zlz.common.entity.PageInfo;
import com.zlz.common.entity.user.UserInfo;
import com.zlz.common.util.PageUtil;
import com.zlz.common.util.ResultSet;
import com.zlz.userserver.exception.ResultRowErrorException;
import com.zlz.userserver.mapper.UserMapper;
import com.zlz.userserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        int row = userMapper.insert(userInfo);
        rowErrorThrowException(row);
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        int row = userMapper.update(userInfo, null);
        rowErrorThrowException(row);
    }

    @Override
    public List<UserInfo> getList(PageInfo pageInfo) {
        IPage<UserInfo> iPage = userMapper.selectPage(PageUtil.getPage(pageInfo), null);
        List<UserInfo> list = iPage.getRecords();
        return list;
    }

    @Override
    public ResultSet getListByType(PageInfo pageInfo, String type) {
        return null;
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
}
