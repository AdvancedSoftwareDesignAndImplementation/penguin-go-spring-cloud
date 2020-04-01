package com.ryzin.spring.cloud.consul.consumer.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 回调类
 * @author Ryzin
 * 实现 FeignHelloService 接口，并实现对应的方法，返回调用失败后的信息
 */
@Component
public class FeignHelloHystrix implements FeignHelloService {

    @RequestMapping("/hello")
    public String hello() {
    	return "sorry, this service call failed.";
    }
}
