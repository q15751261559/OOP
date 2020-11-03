package com.zhenyu.java.week7;

import java.io.*;
import java.util.Arrays;
import java.util.UUID;

public class FileCopy {
    public static void main(String[] args)throws IOException {
        File file=new File("D:/JAVA/LAND1.txt");
        InputStream is=new FileInputStream(file);
        InputStreamReader isr=new InputStreamReader(is);
        char[] b=new char[(int)file.length()];
        int readResult =isr.read(b);
        System.out.println(Arrays.toString(b));
        System.out.println(readResult);
        File file2=new File("D:/JAVA/"+ "LAND2"+".txt");
        OutputStream os=new FileOutputStream(file2);
        OutputStreamWriter osr=new OutputStreamWriter(os);
        osr.write(b);
        isr.close();
        osr.close();
    }
}
