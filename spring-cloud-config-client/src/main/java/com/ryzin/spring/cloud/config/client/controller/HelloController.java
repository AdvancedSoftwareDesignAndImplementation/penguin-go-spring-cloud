package com.ryzin.spring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope // 添加该注解，在客户端执行 /refresh 的时候就会刷新此类下面的配置属性
@RestController
class HelloController {
	
    @Value("${spring.config.hello}") // 声明hello属性从配置文件读取
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}