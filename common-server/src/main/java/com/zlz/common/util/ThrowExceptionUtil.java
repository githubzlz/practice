package com.zlz.common.util;

import com.zlz.common.exception.AuthorityOutOfBoundsException;
import com.zlz.common.exception.NullInputDateException;

/**
 * @author zhulinzhong
 * @version 1.0 createTime:2019/9/29 8:39
 */
public class ThrowExceptionUtil {

    /**
     * 判断数据是否为空，若为空则抛出空数据输入异常
     * @param object
     */
    public static void throwNullInputDateException(Object... object){
        for (int i=0; i <object.length; i++){
            if(object[i] == null){
                throw new NullInputDateException("null值被传入到的service层");
            }
        }
    }

    public static void throwAuthorityOutOfBoundsException(Integer login, Integer operate){

        if(login < operate){
            throw new AuthorityOutOfBoundsException("操作权限不足");
        }
    }
}
