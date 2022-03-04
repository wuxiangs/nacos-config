package com.aisino.nacos.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wuxiang
 * @date 2022/3/3 10:00 上午
 * @email 1325668250@qq.com
 */
@FeignClient(value = "service2")
public interface ProviderClient {


    /**
     * 远程调用
     * @return
     */
    @GetMapping(value = "/service")
    public String service();
}
