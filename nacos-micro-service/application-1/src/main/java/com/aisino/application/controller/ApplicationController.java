package com.aisino.application.controller;

import com.aisino.microservice.service1.api.ConsumerService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxiang
 * @date 2022/3/3 11:06 上午
 * @email 1325668250@qq.com
 */
@RestController
public class ApplicationController {

    @Reference
    ConsumerService consumerService;

    @GetMapping(value = "/service")
    public String service(){
        return consumerService.service();
    }
}
