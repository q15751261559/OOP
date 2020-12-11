package com.zhenyu.java.week14.thread;

public class SaleTicketThread extends Thread{
    private int count=10;
    public void run()
    {
        for (int i=0;i<count;i++)
        {
            System.out.println(Thread.currentThread().getName()+"卖出一张票，当前票数 "+--count);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
