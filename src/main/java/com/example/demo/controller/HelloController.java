package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.HelloClient;

@RestController
public class HelloController {

        @Autowired
	private HelloClient helloClient;

    @GetMapping("/hello-feign")
    public String hellofeign() {
        return helloClient.hello();
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello Service Called");
        return "Hello from Feign";
    }
}
