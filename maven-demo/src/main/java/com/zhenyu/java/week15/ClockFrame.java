package com.zhenyu.java.week15;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;
import java.util.Timer;

public class ClockFrame extends JFrame {
    private JLabel timeLabel;
    private JPanel timePanel;
    private TimerTask timerTask;
    private Timer timer;
    public ClockFrame(){
        init();
        setTitle("闹钟窗体");
        setSize(new Dimension(500,400));
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void init() {
        timeLabel = new JLabel();
        timePanel = new JPanel() {
            protected void paintComponent(Graphics g) {
                try {
                    Image bg= ImageIO.read(new File("C:/Users/石振宇/Desktop/风景图片/img1.jpg"));
                    g.drawImage(bg,0,0,getWidth(),getHeight(),null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        timePanel.setPreferredSize(new Dimension(300,200));
        timePanel.add(timeLabel);
        add(timePanel);
        timerTask=new TimerTask() {
            @Override
            public void run() {
//                Date date=new Date();
//                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                String timeString=sdf.format(date);
//                timeLabel.setText(timeString);
//                if ("2020-12-17 09:10:00".equals(timeString))
//                {
//                    JOptionPane.showMessageDialog(timePanel,"第一个闹钟到了");
//                }
//                if ("2020-12-17 09:10:20".equals(timeString))
//                {
//                    JOptionPane.showMessageDialog(timePanel,"第二个闹钟到了");
//                    this.cancel();
//                }
                QrCodeUtil.generate("https://github.com/q15751261559", 300, 300, FileUtil.file("D:/JAVA/二维码/myGithub.jpg"));
                try {
                    Image bg= ImageIO.read(new File("D:/JAVA/二维码/myGithub.jpg"));
                    Icon icon=new ImageIcon(bg);
                    timeLabel.setIcon(icon);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        Timer timer=new Timer();
        timer.scheduleAtFixedRate(timerTask,0,10000);
    }

    public static void main(String[] args) {
        new ClockFrame();
    }
}
