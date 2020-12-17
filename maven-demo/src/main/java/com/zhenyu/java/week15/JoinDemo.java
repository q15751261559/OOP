package com.zhenyu.java.week15;

public class JoinDemo extends Thread{
    private int num=0;

    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run()
            {
                for (int i=0;i<20;i++)
                {
                        System.out.println("奇数："+i);
                    try {
                        Thread.sleep(500);
                    }catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t2=new Thread(){
            public void run(){
                for (int i=0;i<20;i++)
                {
                        System.out.println("偶数:"+i);
                        try {
                            Thread.sleep(500);
                        }catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
