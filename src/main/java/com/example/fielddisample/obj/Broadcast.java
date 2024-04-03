package com.example.fielddisample.obj;

public class Broadcast {
    // Broadcast needs a stage to make a video of singer's performance
    private Stage stage;

    public Broadcast() {}

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
