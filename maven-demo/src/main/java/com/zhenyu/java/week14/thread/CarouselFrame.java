package com.zhenyu.java.week14.thread;

import javax.swing.*;
import java.awt.*;

public class CarouselFrame extends JFrame {
    private JLabel bgLabel;
    private JLabel textLabel;
    public CarouselFrame(){
        init();
        this.setTitle("CarouselFrame");
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void init()
    {
        bgLabel=new JLabel();
        textLabel=new JLabel();
        CarouselThread ct=new CarouselThread();
        ct.setBgLabel(bgLabel);
        new Thread(ct).start();
        TextThread tt=new TextThread();
        tt.setTextLabel(textLabel);
        new Thread(tt).start();
        add(textLabel,BorderLayout.NORTH);
        add(bgLabel,BorderLayout.CENTER);
        textLabel.setSize(50,500);
    }

    public static void main(String[] args) {
        new CarouselFrame();
    }
}
