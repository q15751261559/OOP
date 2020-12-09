package com.zhenyu.java.week13;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class FileTest {
    public static void main(String[] args) throws IOException {
        LocalDate today=LocalDate.now();
        String dirName=today.getYear()+"-"+today.getMonthValue()+"-"+today.getDayOfMonth();
        File file2=new File("D:/JAVA/"+ dirName);
        if (!file2.exists())
        {
            if (file2.mkdir())
                System.out.println("创建成功");
        }
        String uuid= UUID.randomUUID().toString()+".txt";
        File file=new File(file2+File.separator+uuid);
        if (!file.exists())
        {
            if (file.createNewFile()) {
                System.out.println("创建成功");
            }
        }
    }
}
