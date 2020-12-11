package com.zhenyu.java.week14.thread;

import javax.swing.*;

public class RandomNumberThread implements Runnable{
    private JLabel numberLabel;
    public void setNumberLabel(JLabel numberLabel){
        this.numberLabel=numberLabel;
    }
    public void run(){
        while (true) {
            int a = (int) Math.floor(Math.random() * 100);
            numberLabel.setText(String.valueOf(a));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        RandomNumberThread randomNumberThread=new RandomNumberThread();
        Thread window1=new Thread(randomNumberThread);
        window1.start();
    }
}
