package com.example.springdisample.main;

import com.example.springdisample.obj.Broadcast;
import com.example.springdisample.obj.Singer;
import com.example.springdisample.obj.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DiCheckMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//        Singer singer = (Singer)context.getBean("singer");
//        singer.sing();
        // Broadcast 만 테스트 하면 전체 주입 확인 가능
        Broadcast broadcast = (Broadcast)context.getBean("broadcast");
        broadcast.startBroadcasting();
        broadcast.continueBroadcasting();
        context.close();
    }
}
