package com.hanma56.cloud.ribbon.consummer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RibbonConsummerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonConsummerApplication.class, args);
    }
}
