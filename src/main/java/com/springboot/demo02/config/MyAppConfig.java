package com.springboot.demo02.config;

import com.springboot.demo02.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {
    @Bean
    public HelloService helloService02(){
        System.out.println("添加了");
        return new HelloService();
    }
}
