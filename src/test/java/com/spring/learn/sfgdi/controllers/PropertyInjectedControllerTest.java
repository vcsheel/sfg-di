package com.spring.learn.sfgdi.controllers;

import com.spring.learn.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl();

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}