package com.shixun.mall.service.exception;

/**
 * @author liang
 * @version 1.0
 * @description: 表示密码错误的异常
 * @date 2024/7/11 17:12
 */
public class WrongPasswordException extends ServiceException {
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongPasswordException(Throwable cause) {
        super(cause);
    }

    protected WrongPasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
