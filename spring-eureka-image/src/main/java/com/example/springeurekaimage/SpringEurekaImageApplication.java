package com.example.springeurekaimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient // Enable eureka client. It inherits from @EnableDiscoveryClient.
@SpringBootApplication
public class SpringEurekaImageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaImageApplication.class, args);
    }

}
