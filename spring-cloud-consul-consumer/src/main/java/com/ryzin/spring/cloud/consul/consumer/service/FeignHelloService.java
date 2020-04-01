package com.ryzin.spring.cloud.consul.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-producer")
public interface FeignHelloService {

    @RequestMapping("/hello")
    public String hello();
}
