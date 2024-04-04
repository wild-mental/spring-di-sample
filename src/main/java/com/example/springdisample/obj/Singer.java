package com.example.springdisample.obj;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Getter
public class Singer {
    private String name;
    private String song;

    public Singer() {
        System.out.println("Singer is arrived");
    }

    public Singer(String name, String song) {
        this.name = name;
        this.song = song;
    }

    public void sing() {
        if (name == null || song == null) {
            System.out.println("Singer is singing");
            return;
        }
        System.out.println(name + " is singing " + song);
    }
}
