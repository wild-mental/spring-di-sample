package com.example.fielddisample.obj;

public class Stage {
    private Singer singer;

    public Stage() {
        System.out.println("Stage is ready");
    }

    public void perform() {
        singer.sing();
    }

    public void setSinger(Singer singer) {
        System.out.println("Singer "+ singer.getName() +" has been arrived");
        this.singer = singer;
    }
}
