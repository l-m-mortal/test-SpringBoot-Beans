package com.example.testspringboot3beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:application-context.xml")
public class TestSpringBoot3BeansApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringBoot3BeansApplication.class, args);
    }

}
