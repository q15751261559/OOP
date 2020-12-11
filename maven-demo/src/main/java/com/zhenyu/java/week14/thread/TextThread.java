package com.zhenyu.java.week14.thread;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextThread extends Thread{
    private JLabel textLabel;
    public void setTextLabel(JLabel textLabel)
    {
        this.textLabel=textLabel;
    }
    public void run() {
        File file1 = new File("D:/康德.txt");
        InputStream is= null;
        try {
            is = new FileInputStream(file1);
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line = null;
        while(true){
            line = br.readLine();
            if (line!=null)
            {
                if (!line.equals(""))
                {
                    textLabel.setText(line);
                }
            }
            else
            {
                BufferedReader bz = new BufferedReader(isr);
            }
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        }catch (Exception e) {
            e.printStackTrace();
        }
}

    public static void main(String[] args) {
        File file1 = new File("D:/康德.txt");
        InputStream is= null;
        try {
            is = new FileInputStream(file1);
            InputStreamReader isr=new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            List list = new ArrayList();
            int i = 0;
            String line = null;
            while((line = br.readLine()) != null){
                if (!line.equals(""))
                {

                }
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            br.close();
            isr.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}





