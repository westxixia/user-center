package com.example.usercenter.springdemo.client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringCloudApplication
public class SpringdemoClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringdemoClientApplication.class, args);
    }

}
