package com.stubbornboy.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {


    @RequestMapping("/spring")
    public String tests(){
        System.out.println("hello spring mvc");
        return "test";
    }
}
