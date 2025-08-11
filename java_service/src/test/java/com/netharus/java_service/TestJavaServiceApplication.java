package com.netharus.java_service;

import org.springframework.boot.SpringApplication;

public class TestJavaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(JavaServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
