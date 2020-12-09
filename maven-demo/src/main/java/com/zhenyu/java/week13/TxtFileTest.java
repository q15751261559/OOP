package com.zhenyu.java.week13;

import java.io.*;

public class TxtFileTest {
    public static void main(String[] args) throws IOException {
        File file1=new  File("D:/JAVA/FileWriter.txt");
        File file2=new  File("D:/JAVA/BufferedWriter.txt");
        File file3=new  File("D:/JAVA/PrintWriter.txt");
        char[] char1="demoTest".toCharArray();
        String test="test";
        //1
        Writer FileWriter=new FileWriter(file1,true);
        FileWriter.write(char1);
        FileWriter.close();
        FileWriter fileWriter=new FileWriter(file2);
        //2
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write(test);
        bufferedWriter.close();
        //3
        PrintWriter printWriter=new PrintWriter(file3);
        printWriter.write(char1);
        printWriter.close();

        //输入
        InputStream inputStream = new FileInputStream(file1);
        byte[] a=new byte[(int)file1.length()];
        int b= inputStream.read(a);
        System.out.println(b);
    }
}
