package com.aisino.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wuxiang
 * @date 2022/3/2 2:08 下午
 * @email 1325668250@qq.com
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Service2Application {

    public static void main(String[] args) {
        SpringApplication.run(Service2Application.class,args);
    }
}
