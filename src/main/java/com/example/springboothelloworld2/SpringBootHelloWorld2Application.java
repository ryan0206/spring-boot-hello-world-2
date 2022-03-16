package com.example.springboothelloworld2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorld2Application {

    public static void main(String[] args) {
        System.out.println("Test dev branch");
        System.out.println("This is dev branch");
        SpringApplication.run(SpringBootHelloWorld2Application.class, args);
    }

}
