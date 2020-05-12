package com.spring.learn.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"HIN", "default"})
@Service("i18nService")
public class I18nHinGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Namaste!";
    }
}
