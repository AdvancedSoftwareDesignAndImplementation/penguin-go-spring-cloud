package com.ryzin.spring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
	
    @Value("${spring.config.hello}") // 声明hello属性从配置文件读取
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}