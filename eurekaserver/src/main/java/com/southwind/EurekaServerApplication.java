package com.southwind;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication  //声明该类是 springboot 服务的路口
@EnableEurekaServer  //成为一个注册中心  声明该类是一个 Eureka Server 微服务，提供服务注册和服务发现功能
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }


}
