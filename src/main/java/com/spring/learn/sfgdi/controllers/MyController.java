package com.spring.learn.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHi() {
        System.out.println("Hi!");

        return "Hello there!";
    }

}
