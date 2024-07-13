package com.shixun.mall.service.exception;

/**
 * @author liang
 * @version 1.0
 * @description: 表示用户名不存在的异常
 * @date 2024/7/11 17:05
 */
public class UserNotExistException extends ServiceException {
    public UserNotExistException() {
        super();
    }

    public UserNotExistException(String message) {
        super(message);
    }

    public UserNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotExistException(Throwable cause) {
        super(cause);
    }

    protected UserNotExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
