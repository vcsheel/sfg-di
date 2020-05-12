package com.spring.learn.sfgdi;

import com.spring.learn.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        System.out.println("=============================");

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.greet());

        System.out.println("=============================");

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println("------- Primary Bean ----------");
        String message = controller.sayHi();

        System.out.println(message);

        System.out.println("------- Property Injected Controller ----------");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------- Setter Injected Controller ----------");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------- Constructor Injected Controller ----------");
        //works without @AutoWired
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
