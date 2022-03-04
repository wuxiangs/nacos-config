package com.aisino.microservice.service1.service;

import com.aisino.microservice.service1.api.ConsumerService;
import com.aisino.microservice.service2.api.ProviderService;
import org.apache.dubbo.config.annotation.Reference;

/**
 * @author wuxiang
 * @date 2022/3/3 11:31 上午
 * @email 1325668250@qq.com
 */
/**
 * 此类方法的暴露为dubbo接口
 * @author wuxiang
 */
@org.apache.dubbo.config.annotation.Service
public class ConsumerServiceImpl implements ConsumerService {

    @Reference
    private ProviderService providerService;


    @Override
    public String service() {
        return providerService.service();
    }
}
