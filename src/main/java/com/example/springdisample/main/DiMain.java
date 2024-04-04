package com.example.springdisample.main;

import com.example.springdisample.obj.Singer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DiMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Singer singer = (Singer)context.getBean("singer");
        singer.sing();
    }
}
