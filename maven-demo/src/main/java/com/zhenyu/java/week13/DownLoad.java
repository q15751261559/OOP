package com.zhenyu.java.week13;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class DownLoad  {
    public static void  DownUrl(String url,String path,String imgName)throws IOException
    {
        URL q=new URL(url);
        URLConnection con=q.openConnection();
        con.setConnectTimeout(5*1000);
        InputStream is=con.getInputStream();
        byte[] bytes=new byte[1024];
        File file=new File(path);
        if (!file.exists())
        {
            file.mkdir();
        }
        OutputStream outputStream=new FileOutputStream(file.getPath()+"/"+imgName);
        int i;
        while ((i=is.read(bytes))!=-1)
        {
            outputStream.write(bytes,0,i);
        }
        outputStream.close();
        is.close();
    }

    public static void main(String[] args) throws IOException {
        DownUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1606990980437&di=017ea096addfc1d32f0aab9f66275063&imgtype=0&src=http%3A%2F%2Fa4." +
                "att.hudong.com%2F27%2F67%2F01300000921826141299672233506.jpg",
                "C:/Users/石振宇/Desktop/风景图片","img1.jpg");
    }
}
