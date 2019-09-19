package com.boot.account.exep;


/**
 * 自定义业务层错误异常信息
 */
public class BusinessException extends Exception {
    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
