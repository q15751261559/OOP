package com.zhenyu.java.week7;

public class FlyTest {
    Fly fly=new Bird();
    public void fly(){
        fly.fly("大雁",60);
        fly=new Plane();
        System.out.println("%%%%%%%");
        fly.fly("波音737",1000);
    }
}
