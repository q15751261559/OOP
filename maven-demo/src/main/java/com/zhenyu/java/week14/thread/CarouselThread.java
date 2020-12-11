package com.zhenyu.java.week14.thread;

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class CarouselThread extends Thread {
    JLabel bgLabel;
    private String[] imgs={"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607585030330&di=3f1a78c225289f437772b53b44b7761a&imgtype=0&src=http%3A%2F%2Fattach.bbs.miui.com%2Fforum%2Fmonth_1012%2F10120514509c7244b23f4a2fa5.jpg","https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607585030329&di=98d2d4487679c3a8848d8eeb95210ce4&imgtype=0&src=http%3A%2F%2Fattach.bbs.miui.com%2Fforum%2F201303%2F16%2F075154gfxiljfvfidzfcvt.jpg"};
    public void setBgLabel(JLabel bgLabel)
    {
        this.bgLabel=bgLabel;
    }
    public void run(){
        int index=0;
        int length=imgs.length;
        while (true)
        {
            try{
                URL url=new URL(imgs[index]);
                HttpURLConnection conn=(HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setConnectTimeout(5000);
                InputStream is=conn.getInputStream();
                byte[] buffer=new byte[1024];
                int len=0;
                ByteArrayOutputStream baos=new ByteArrayOutputStream();
                while((len=is.read(buffer))!=-1){
                    baos.write(buffer,0,len);
                }
                byte[]data=baos.toByteArray();
                is.read(data);
                Icon icon=new ImageIcon(data);
                bgLabel.setIcon(icon);
                Thread.sleep(1000);
            }catch (Exception e)
            {
                System.err.println("异常");
            }
            index++;
            if (index==length)
                index=0;
        }
    }
}
