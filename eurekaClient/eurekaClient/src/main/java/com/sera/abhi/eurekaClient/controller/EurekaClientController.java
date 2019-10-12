package com.sera.abhi.eurekaClient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

    @GetMapping(path = "/client/show")
    public String hello(){
        return "Hello-world";
    }

}
