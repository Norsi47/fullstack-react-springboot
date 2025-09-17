package com.myeazystore.myeazystore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //annotation that helps rest api, support http protocal
    @GetMapping("/hello")
    //method name to say hello world
    public String sayHello() {
        return "Hello World";

    }

}


