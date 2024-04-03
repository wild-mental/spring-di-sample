package com.example.constructordisample.obj;

public class Stage {
    private Singer singer;

    public Stage(Singer singer) {
        System.out.println("Stage is ready");
        System.out.println("Singer "+ singer.getName() +" has been arrived");
        this.singer = singer;
    }

    public void perform() {
        singer.sing();
    }
}
