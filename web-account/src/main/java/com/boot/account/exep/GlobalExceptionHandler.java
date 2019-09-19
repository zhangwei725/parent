package com.boot.account.exep;

import com.boot.account.common.ErrorResult;
import com.boot.account.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;


/**
 *
 * @author zhangwei
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    // 全局的错误的异常处理
    //

    /**
     * 数据库层异常
     * 业务层的异常
     */
    //    value处理那个异常

    @ExceptionHandler(BusinessException.class)
        public Result baseException(HttpServletRequest request, Exception ex) {
            return ErrorResult.error();
    }

}
