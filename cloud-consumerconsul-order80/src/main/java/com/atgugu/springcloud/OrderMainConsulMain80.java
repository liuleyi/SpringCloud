package com.atgugu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderMainConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainConsulMain80.class,args);
    }
}

