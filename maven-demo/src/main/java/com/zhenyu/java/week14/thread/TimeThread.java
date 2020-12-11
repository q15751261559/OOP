package com.zhenyu.java.week14.thread;

import javax.swing.*;
import java.time.LocalDateTime;

public class TimeThread extends Thread {
    private JLabel timeLabel;
    public void run(){
        while (true)
        {
            timeLabel.setText(LocalDateTime.now().toString());
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    public void setTimeLabel(JLabel timeLabel){
        this.timeLabel=timeLabel;
    }

    public static void main(String[] args) {
        TimeThread timeThread=new TimeThread();
        Thread window1=new Thread(timeThread);
        window1.start();
    }
}
