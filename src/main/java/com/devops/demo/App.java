package com.devops.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class App {

    @GetMapping("/")
    public String hello(){
        return "DevOps CI/CD Pipeline Working!";
    }

    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }
}
