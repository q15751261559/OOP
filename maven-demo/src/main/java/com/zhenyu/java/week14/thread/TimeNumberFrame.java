package com.zhenyu.java.week14.thread;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import com.zhenyu.java.week14.thread.TimeThread;

public class TimeNumberFrame extends JFrame {
    public TimeNumberFrame(){
        this.setTitle("TimeNumber");
        init();
        this.getContentPane().setBackground(new Color(0,0,0));
        setSize(600,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void init(){
        System.out.println("init");
        JLabel timeLabel=new JLabel();
        JLabel numberLabel=new JLabel();
        Font font=new Font("微软雅黑",Font.BOLD,20);
        Color color=new Color(255,255,255);
        timeLabel.setForeground(color);
        numberLabel.setForeground(color);
        timeLabel.setFont(font);
        numberLabel.setFont(font);
        add(timeLabel,BorderLayout.SOUTH);
        TimeThread tt=new TimeThread();
        tt.setTimeLabel(timeLabel);
        new Thread(tt).start();
        add(numberLabel);
        RandomNumberThread rnt=new RandomNumberThread();
        rnt.setNumberLabel(numberLabel);
        new Thread(rnt).start();
    }

    public static void main(String[] args) {
        new TimeNumberFrame();
    }
}
