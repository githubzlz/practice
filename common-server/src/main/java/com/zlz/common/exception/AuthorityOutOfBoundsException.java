package com.zlz.common.exception;

/**
 * 权限不足，操作权限越界时抛出的异常
 * @author zhulinzhong
 * @version 1.0 createTime:2019/9/29 9:05
 */
public class AuthorityOutOfBoundsException extends RuntimeException {
    public AuthorityOutOfBoundsException() {
    }

    public AuthorityOutOfBoundsException(String message) {
        super(message);
    }

    public AuthorityOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthorityOutOfBoundsException(Throwable cause) {
        super(cause);
    }

    public AuthorityOutOfBoundsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
