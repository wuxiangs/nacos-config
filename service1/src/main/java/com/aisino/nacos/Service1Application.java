package com.aisino.nacos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuxiang
 * @date 2022/3/2 1:57 下午
 * @email 1325668250@qq.com
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class Service1Application {

    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class,args);
    }

    @Resource
    ConfigurableApplicationContext applicationContext;

    @GetMapping("/config")
    public String getConfigs(){
        String name=applicationContext.getEnvironment().getProperty("person.name");
        String age=applicationContext.getEnvironment().getProperty("person.age");
        String address=applicationContext.getEnvironment().getProperty("person.address");
        String birthday=applicationContext.getEnvironment().getProperty("person.birthday");
        return name+age+address+birthday;
    }

}
