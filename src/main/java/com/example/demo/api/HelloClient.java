package com.example.demo.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "hello-client", url="http://hello-app:8080")
public interface HelloClient {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();
}