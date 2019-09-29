package com.zlz.common.exception;

/**
 * 公共异常父类
 * @author zhulinzhong
 * @version 1.0 createTime:2019/9/29 8:45
 */
public class CommonException extends RuntimeException{
    public CommonException() {
    }

    public CommonException(String message) {
        super(message);
    }

    public CommonException(String message, Throwable cause) {
        super(message, cause);
    }

    public CommonException(Throwable cause) {
        super(cause);
    }

    public CommonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
