package com.spring.learn.sfgdi.controllers;

import com.spring.learn.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHi() {
        System.out.println("Hi!");

        return greetingService.sayGreeting();
    }

}
