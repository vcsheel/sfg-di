package com.spring.learn.sfgdi.controllers;

import com.spring.learn.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorInjectedGreetingService();

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}