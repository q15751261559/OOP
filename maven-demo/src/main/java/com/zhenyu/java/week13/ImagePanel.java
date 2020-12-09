package com.zhenyu.java.week13;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {
    private String fileName;

    public void setFileName(String fileName)
    {
        this.fileName=fileName;
    }
    protected void paintComponent(Graphics g)
    {
        ImageIcon icon=new ImageIcon(fileName);
        Image image=icon.getImage();
        g.drawImage(image,0,0,this.getWidth(),this.getHeight(),icon.getImageObserver());
    }
}
