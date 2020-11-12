package com.zhenyu.java.week9;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Exception {
    public static void random()
    {
        Random random = new Random();
        while (true)
        {
            int i=random.nextInt(100);
            System.out.println(i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        long timeStamp=System.currentTimeMillis();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date(timeStamp);
        String str=df.format(date);
        System.out.println(str);
        System.out.println("********************");
        Instant instant=Instant.ofEpochMilli(timeStamp);
        ZoneId zone=ZoneId.systemDefault();
        LocalDateTime localDateTime=LocalDateTime.ofInstant(instant,zone);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String result=localDateTime.format(formatter);
        System.out.println(result);
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e)
        {
            System.err.println("中断异常");
        }
        System.out.println(System.currentTimeMillis());
        random();



        try {
            System.out.println(3 / 0);
        }catch (ArithmeticException e){
           // System.err.println("除数不能为0!");
            //System.err.println(e.getMessage());
            //System.err.println(e.getCause());
          //System.err.println(e);
        //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"除数不能为0");
        }

        System.out.println("Please input");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        int res = 0;
        try {
            res = Integer.parseInt(string);
            System.out.println(result);
        } catch (NumberFormatException s) {
            System.err.println("数字格式化异常");
        } finally {
            //应用场景:关闭数据库连接，线程资源的释放，流的关闭
            System.out.println("finish");
            in.close();
        }

        int[] a={1,2,3,4,5};
        try{
            for (int i=0;i<=5;i++)
            {
                System.out.println(a[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("数组下标越界");
        }



        String  s=null;
          if("admin".equals(s)){
          System.out.println("success");
        }else {
          System.out.println("failure");
         }

        String z=null;
        if (z==null|| "".equals(z)) {
            System.out.println("帐号不能为空");
        }
    }

}
