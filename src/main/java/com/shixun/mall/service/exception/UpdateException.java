package com.shixun.mall.service.exception;

/**
 * @author liang
 * @version 1.0
 * @description: 表示更新失败的异常
 * @date 2022/7/17 19:09
 */
public class UpdateException extends ServiceException{
    public UpdateException() {
        super();
    }

    public UpdateException(String message) {
        super(message);
    }

    public UpdateException(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateException(Throwable cause) {
        super(cause);
    }

    protected UpdateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
