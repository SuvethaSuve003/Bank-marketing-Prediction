package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(Main.class, args);


        String[] beans = applicationContext.getBeanDefinitionNames();
        System.out.println("========BEANS=======");
        for (String bean : beans)
        {
            System.out.println(bean);
        }
        System.out.println("========End of bean list=======");
        System.out.println("Welcome our Spring Boot App");

    }
}