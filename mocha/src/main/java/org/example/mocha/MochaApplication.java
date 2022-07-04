package org.example.mocha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // Eureka Client
public class MochaApplication {
    public static void main(String[] args) {
        SpringApplication.run(MochaApplication.class, args);
    }
}
