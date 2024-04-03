package com.example.springdisample.obj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Broadcast {
    // Broadcast needs a stage to make a video of singer's performance
    // @Autowired
    private Stage stage;

    public Broadcast() {}

    @Autowired
    public Broadcast(Stage stage) {
        System.out.println("Broadcast is ready");
        this.stage = stage;
    }

    public void startBroadcasting() {
        System.out.println("Start Broadcasting the performance...");
        stage.perform();
    }

    public void continueBroadcasting() {
        System.out.println("Broadcasting...");
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
