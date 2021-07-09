package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy  //该注解包含 @EnableZuulServer:成为网关  设置该类是网关的启动类
@SpringBootApplication  //该注解包含 @EnableAutoConfiguration：可以帮助 springboot 应用将所有符合条件的 @configuration 配置到当前
//springboot创建并使用的IOC容器中
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
