package com.example.constructordisample.obj;

import lombok.Getter;

@Getter
public class Singer {
    private String name;
    private String song;

    public Singer(String name, String song) {
        this.name = name;
        this.song = song;
    }

    public void sing() {
        System.out.println(name + " is singing " + song);
    }
}
