package com.example.demosss.spring.mockito.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    Logger logger= LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    public String home(){
        logger.error("Error happened");
        return "Hello from Spring Boot";
    }
}
