package com.zlz.userserver.exception;

/**
 * @author zhulinzhong
 * @version 1.0 createTime:2019/9/27 18:02
 */
public  class ResultRowErrorException extends RuntimeException {
    public ResultRowErrorException() {
    }

    public ResultRowErrorException(String message) {
        super(message);
    }

    public ResultRowErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResultRowErrorException(Throwable cause) {
        super(cause);
    }

    public ResultRowErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
