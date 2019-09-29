package com.zlz.userserver.exception;

/**
 * 用户服务操作异常父类
 * @author zhulinzhong
 * @version 1.0 createTime:2019/9/29 8:44
 */
public class UserServiceException extends RuntimeException{
    public UserServiceException() {
    }

    public UserServiceException(String message) {
        super(message);
    }

    public UserServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserServiceException(Throwable cause) {
        super(cause);
    }

    public UserServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
