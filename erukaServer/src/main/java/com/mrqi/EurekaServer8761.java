package com.mrqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EurekaServer8761 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8761.class, args);
    }
}
