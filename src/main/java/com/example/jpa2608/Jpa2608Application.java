package com.example.jpa2608;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Jpa2608Application {

    public static void main(String[] args) {
        SpringApplication.run(Jpa2608Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(TestService testService) {
        return args -> testService.doSomething();
    }
}
