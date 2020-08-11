package com.example.learn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(SimpleProperties simpleProperties, NestedProperties nestedProperties) {
            return r -> {
            };
    }

}
