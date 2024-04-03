package com.example.constructordisample.main;

import com.example.constructordisample.obj.Broadcast;
import com.example.constructordisample.obj.Singer;
import com.example.constructordisample.obj.Stage;

public class ConstructorInjectionMain {
    public static void main(String[] args) {
        // create a singer and make a performance on stage
        Singer singer = new Singer("Beyonce", "Texas Hold'Em");
        Stage stage = new Stage(singer);
        Broadcast broadcast = new Broadcast(stage);
        broadcast.startBroadcasting();
        broadcast.continueBroadcasting();
    }
}
