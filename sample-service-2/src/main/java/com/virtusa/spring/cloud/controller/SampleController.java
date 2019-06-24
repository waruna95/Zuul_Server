package com.virtusa.spring.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hi, welcome to service 2";
    }

    @GetMapping("/admin")
    public String sayHelloAdmin() {
        return "Hi, welcome to service 2 Admin";
    }

}
