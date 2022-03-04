package com.aisino.nacos.controller;

import com.aisino.nacos.client.ProviderClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuxiang
 * @date 2022/3/3 9:57 上午
 * @email 1325668250@qq.com
 */
@RestController
public class ConsumerController {

    private static final Logger logger= LoggerFactory.getLogger(ConsumerController.class);


    @Resource
    private ProviderClient providerClient;

    @GetMapping(value = "/consumer")
    public String consumer(){
        logger.info("consumer invoke");
        return providerClient.service();
    }
}
