package com.example.demospringsecurity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SeController {

    private String prefix = "/pages/";

    @GetMapping("/level1/{id}")
    public String gotoLe(@PathVariable Integer id){

        return prefix+"level1_"+id;
    }
    @GetMapping("/level2/{id}")
    public String gotoLe2(@PathVariable Integer id){

        return prefix+"level2_"+id;
    }


    @GetMapping("/")
    public String welcome(){
        return "welcome";
    }
}
