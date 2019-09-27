package com.zlz.common.util;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zlz.common.entity.PageInfo;

/**
 * 分页工具类
 * @author zhulinzhong
 * @version 1.0 createTime:2019/9/27 17:45
 */
public class PageUtil {

    /**
     * pageInfo转化为IPage对象
     * @param pageInfo
     * @return
     */
    public static IPage getPage(PageInfo pageInfo){
        return new Page(pageInfo.getCurrent(), pageInfo.getSize());
    }

}
