package com.yuejinfu.aop;

public class Target implements TargetInterface {
    public void save() {
        System.out.println("running...");
    }
}
