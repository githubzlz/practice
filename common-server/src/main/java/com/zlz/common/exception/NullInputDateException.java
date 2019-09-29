package com.zlz.common.exception;

/**
 * controller传入service的数据为空时抛出的异常
 * @author zhulinzhong
 * @version 1.0 createTime:2019/9/29 8:37
 */
public class NullInputDateException extends CommonException {
    public NullInputDateException() {
    }

    public NullInputDateException(String message) {
        super(message);
    }

    public NullInputDateException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullInputDateException(Throwable cause) {
        super(cause);
    }

    public NullInputDateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
