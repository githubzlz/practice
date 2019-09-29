package com.zlz.userserver.exception;

/**
 * @author zhulinzhong
 * @version 1.0 createTime:2019/9/29 9:28
 */
public class UpdateUserInfoException extends UserServiceException {
    public UpdateUserInfoException() {
    }

    public UpdateUserInfoException(String message) {
        super(message);
    }

    public UpdateUserInfoException(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateUserInfoException(Throwable cause) {
        super(cause);
    }

    public UpdateUserInfoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
