package com.springboot.demo02.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//发送一个请求 然后把这个请求直接给浏览器 而不是页面跳转（如果是对象可以转为jspn数据）
//@ResponseBody
//@Controller
//上面两个的合并功能
@RestController
public class HelloController {
    @Value("${person.name}")
    private String name;


    //接收一个什么请求 "查询"
    @RequestMapping("/sayhello")
    public String hello(){
        return "helloworld"+name;

    }
}
