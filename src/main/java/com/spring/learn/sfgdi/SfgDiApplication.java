package com.spring.learn.sfgdi;

import com.spring.learn.sfgdi.controllers.ConstructorInjectedController;
import com.spring.learn.sfgdi.controllers.MyController;
import com.spring.learn.sfgdi.controllers.PropertyInjectedController;
import com.spring.learn.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

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
