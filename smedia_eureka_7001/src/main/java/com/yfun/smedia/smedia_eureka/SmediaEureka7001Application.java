package com.yfun.smedia.smedia_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SmediaEureka7001Application {

    public static void main(String[] args) {
        SpringApplication.run(SmediaEureka7001Application.class, args);
    }

}
