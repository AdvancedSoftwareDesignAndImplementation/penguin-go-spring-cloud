package com.ryzin.spring.cloud.consul.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试Feign接口
 * @author Ryzin
 * 在 @FeignClient 注解中加入 fallback 属性，绑定我们创建的失败回调处理类
 */
@FeignClient(name = "service-producer", fallback = FeignHelloHystrix.class) // service-producer是要调用的服务名
public interface FeignHelloService {
	
	// 添加跟调用目标方法一样的方法声明，只需要方法声明，不需要具体实现，注意跟目标方法定义保持一致
    @RequestMapping("/hello")
    public String hello();
}
