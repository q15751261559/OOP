package com.zhenyu.java.week13;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class ImageFrame extends JFrame{
    private ImagePanel mainPanel;
    private JLabel imgLabel;

    public ImageFrame(){
        mainPanel.setFileName("C:/Users/石振宇/Desktop/新建文件夹 (2)/TIM图片20181013183403.jpg");
        mainPanel.repaint();
        this.setTitle("图片窗体");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        File file=new File("C:/Users/石振宇/Desktop/新建文件夹 (2)/TIM图片20181013183403.jpg");
        byte[] bytes=new byte[(int)file.length()];
        try{
            bytes=ImageReader.readFromFile(file);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        Icon icon=new ImageIcon(bytes);
        imgLabel.setIcon(icon);
    }

    public static void main(String[] args) {
        new ImageFrame();
    }
}
