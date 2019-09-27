package com.zlz.userserver.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zlz.common.entity.user.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhulinzhong
 * @version 1.0 createTime:2019/9/27 10:47
 */

@Mapper
public interface UserMapper extends BaseMapper<UserInfo> {
}
