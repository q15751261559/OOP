package com.zhenyu.java.week13;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ImageReader {
    public static byte[] readFromFile(File file) throws IOException
    {
        InputStream inputStream=new FileInputStream(file);
        byte[] b=new byte[(int)file.length()];
        int count=inputStream.read(b);
        return b;
    }
}
