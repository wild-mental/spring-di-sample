package com.example.springdisample.main;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringApplication.class);
        System.out.println(context.getBean("Broadcast").getClass());
        System.out.println(context.getBean("Stage").getClass());
        System.out.println(context.getBean("Singer").getClass());
    }
}
