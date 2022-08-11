package com.example.springeurekagallery.controllers;

import freemarker.core.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Environment env;


    @RequestMapping("/")
    public String home() {
        return "Hello from Gallery Service running at port : " + env.getProperty("local.server.port");
    }
}
