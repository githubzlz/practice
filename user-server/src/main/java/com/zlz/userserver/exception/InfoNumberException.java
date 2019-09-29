package com.zlz.userserver.exception;

/**
 * 返回用户信息的数量为0时抛出的异常
 * @author zhulinzhong
 * @version 1.0 createTime:2019/9/29 8:29
 */
public class InfoNumberException extends UserServiceException{

    public InfoNumberException() {
    }

    public InfoNumberException(String message) {
        super(message);
    }

    public InfoNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public InfoNumberException(Throwable cause) {
        super(cause);
    }

    public InfoNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
