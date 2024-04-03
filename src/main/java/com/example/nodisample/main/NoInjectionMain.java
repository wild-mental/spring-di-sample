package com.example.nodisample.main;

import com.example.nodisample.obj.Broadcast;

public class NoInjectionMain {
    public static void main(String[] args) {
        Broadcast.broadcastBySelfDependency();
    }
}
