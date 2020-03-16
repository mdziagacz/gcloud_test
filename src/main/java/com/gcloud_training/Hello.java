package com.gcloud_training;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
@CrossOrigin("*")
public class Hello {

    @GetMapping
    public String hello(){
        return "Hello, YES I'M WORKING!!!!!!!!!!!!!!!!";
    }
}
