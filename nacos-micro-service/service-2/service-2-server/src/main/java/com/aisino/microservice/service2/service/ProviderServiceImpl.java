package com.aisino.microservice.service2.service;

import com.aisino.microservice.service2.api.ProviderService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author wuxiang
 * @date 2022/3/3 2:17 下午
 * @email 1325668250@qq.com
 */
@Service
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String service() {
        return "provider invoke";
    }
}
