package com.spring.learn.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryBeanGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "warm greetings from Primary bean";
    }
}
