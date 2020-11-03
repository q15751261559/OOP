package com.zhenyu.java.week7;

public class Plane implements Fly {
    @Override
    public void fly(String name, int speed) {
        System.out.println(name+"飞行，时速"+speed);
    }
}
