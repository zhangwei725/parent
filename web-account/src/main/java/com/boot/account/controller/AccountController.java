package com.boot.account.controller;


import com.boot.account.annotation.ResponseEntity;
import com.boot.account.common.Result;
import com.boot.account.common.SuccessResult;
import com.boot.account.entity.Shop;
import com.boot.account.exep.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangwei
 */
@RestController
public class AccountController {
    /**
     * 返回时
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseEntity
    public Shop list() {
        Shop shop = new Shop();
        shop.setTitle("测试数据");
        return shop;
    }

    @RequestMapping("/detail")
    public Result<Shop> detail() {
        return SuccessResult.succes();
    }

    @RequestMapping("/ex")
    public Result<Shop> ex() throws BusinessException {
        throw new BusinessException("数据连接超时");
    }

}
