package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "com.service" })
@SpringBootApplication
public class SpringbootSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSimpleApplication.class, args);
    }

}
