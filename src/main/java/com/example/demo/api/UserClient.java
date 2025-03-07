package com.example.demo.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.WeatherInfo;

@FeignClient(name = "user-client", url="https://jsonplaceholder.typicode.com")
public interface UserClient {

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    String getUsers();
}