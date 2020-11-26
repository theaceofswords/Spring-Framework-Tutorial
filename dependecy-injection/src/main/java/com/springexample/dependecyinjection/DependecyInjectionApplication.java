package com.springexample.dependecyinjection;

import com.springexample.dependecyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependecyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(DependecyInjectionApplication.class, args);

        Controller1 controller1 = (Controller1) app.getBean("controller1"); // class name with lower case starting
        System.out.println(controller1.print());

        PropertyInjectedController pri = (PropertyInjectedController) app.getBean("propertyInjectedController");
        System.out.println(pri.getGreetings()+" from property injected controller");

        SetterInjectedController str = (SetterInjectedController) app.getBean("setterInjectedController");
        System.out.println(str.getString()+" from setter injected controller");

        ConstructorInjectedController cic = (ConstructorInjectedController) app.getBean("constructorInjectedController");
        System.out.println(cic.getString()+" from constructor injected controller");

        I18NController i18n = (I18NController) app.getBean("i18NController");
        System.out.println(i18n.sayHello());


    }

}
