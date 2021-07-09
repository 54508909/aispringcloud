package com.southwind;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * consumer该服务为服务消费者因为它有被注册到服务中心
 * resettemplate 该服务不是服务消费者因为它没有被注册到服务中心
 */
@SpringBootApplication
public class ConsumerApplication {


    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
