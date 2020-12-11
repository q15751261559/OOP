package com.zhenyu.java.week14.thread;

public class SaleTicketAdvancedThread implements Runnable{
    private static final int TOTAL_COUNT=10;
    private static int tickets=TOTAL_COUNT;
    private final Object lock=new Object();
    public void run(){
            while (true) {
                synchronized (lock) {
                    if (tickets>0) {
                        sellTickets();
                    }else {
                        System.out.println("票数不足");
                        break;
                    }
                }
            }
    }
    private synchronized void sellTickets(){
        if (tickets>0)
        {
            System.out.println(Thread.currentThread().getName() + "卖出一张票，当前票数 " + --tickets);
        }
        try{
            Thread.sleep(500);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
