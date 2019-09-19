package com.boot.account.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangwei
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResult implements Result {
    private int status;
    private String msg;

    public static ErrorResult error(int status, Exception ex) {
        return new ErrorResult(status, ex.getMessage());
    }
    public static ErrorResult error() {
        return new ErrorResult(500, "网络异常!!! 请联系运维小哥哥");
    }

}
