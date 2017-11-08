package com.kglenm.security.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @RequestMapping(value = "/test")
    public String showResult(){

        return "congrats";
    }
}
