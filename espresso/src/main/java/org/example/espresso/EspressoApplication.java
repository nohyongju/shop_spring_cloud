package org.example.espresso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // Eureka Client
public class EspressoApplication {
    public static void main(String[] args) {
        SpringApplication.run(EspressoApplication.class, args);
    }
}
