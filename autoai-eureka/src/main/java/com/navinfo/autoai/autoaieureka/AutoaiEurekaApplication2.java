package com.navinfo.autoai.autoaieureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AutoaiEurekaApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(AutoaiEurekaApplication2.class, args);
    }

}
