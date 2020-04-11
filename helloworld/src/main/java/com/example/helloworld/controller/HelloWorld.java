package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloWorld {


    @GetMapping("hello")
    public String hello(){
        return "hello world 1";
    }

}
