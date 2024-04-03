package com.example.fielddisample.main;

import com.example.fielddisample.obj.Broadcast;
import com.example.fielddisample.obj.Singer;
import com.example.fielddisample.obj.Stage;

public class FieldInjectionMain {
    public static void main(String[] args) {
        // 방송 생성
        Broadcast broadcast = new Broadcast();
        // ## 스테이지 생성
        Stage stage = new Stage();
        // ## ## 가수 생성
        Singer singer = new Singer("Beyonce", "Texas Hold'Em");
        // ## 스테이지에 가수 필드 주입
        stage.setSinger(singer);
        // 방송에 스테이지 주입
        broadcast.setStage(stage);

        // 방송 실행
        broadcast.startBroadcasting();
        broadcast.continueBroadcasting();
    }
}
