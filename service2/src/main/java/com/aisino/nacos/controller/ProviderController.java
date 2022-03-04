package com.aisino.nacos.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxiang
 * @date 2022/3/3 9:50 上午
 * @email 1325668250@qq.com
 */
@RestController
public class ProviderController {
    private static final Logger logger = LoggerFactory.getLogger(ProviderController.class);


    @GetMapping(value = "/service")
    public String service(){
        logger.info("provider invoke");
        return "provider invoke";
    }

}
