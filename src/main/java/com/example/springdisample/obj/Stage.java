package com.example.springdisample.obj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Stage {
    // @Autowired
    private Singer singer;

    @Autowired
    public Stage(Singer singer) {
        System.out.println("Stage is ready");
        this.singer = singer;
    }

    public void perform() {
        singer.sing();
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }
}
