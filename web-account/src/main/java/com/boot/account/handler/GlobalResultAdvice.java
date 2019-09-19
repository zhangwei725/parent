package com.boot.account.handler;

import com.boot.account.annotation.ResponseEntity;
import com.boot.account.common.SuccessResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 返回统一的结果  RestControllerAdvice
 * ResponseBodyAdvice 接口
 * @author zhangwei
 */
@RestControllerAdvice
@Slf4j
public class GlobalResultAdvice  implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        log.error("supports");
        return true;
    }

    /**
     *
     * @param body
     * @param returnType
     * @param selectedContentType
     * @param selectedConverterType
     * @param request
     * @param response
     * @return
     */
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        ResponseEntity annotation = returnType.getMethod().getAnnotation(ResponseEntity.class);
        if(annotation!= null){
             return  SuccessResult.succes(body);
        }
        return body;
    }
}
