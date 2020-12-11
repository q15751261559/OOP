package com.zhenyu.java.week14.thread;
import com.zhenyu.java.week14.thread.TimeThread;
public class HelloThreadApp {
    public static void main(String[] args) {
//        TimeThread ht=new TimeThread();
//        ht.start();
        //1
//        SaleTicketThread window1=new SaleTicketThread();
//        window1.setName("窗口1");
//        SaleTicketThread window2=new SaleTicketThread();
//        window2.setName("窗口2");
//        window1.start();
//        window2.start();
        //2
        SaleTicketAdvancedThread stat=new SaleTicketAdvancedThread();
        Thread window1=new Thread(stat);
        window1.setName("窗口1");
        Thread window2=new Thread(stat);
        window2.setName("窗口2");
        window1.start();
        window2.start();
    }
}
