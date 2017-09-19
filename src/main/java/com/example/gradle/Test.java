package com.example.gradle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {

    @RequestMapping("/")
    private String index(){
        return "index";
    }

    @RequestMapping("/login")
    private String login(){
        return "login";
    }

    @RequestMapping("/success")
    private String success(){
        return "success";
    }
}
