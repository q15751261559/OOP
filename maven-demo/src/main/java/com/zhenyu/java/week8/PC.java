package com.zhenyu.java.week8;

/**
 * @ClassName PC
 * @Description TODO
 * @Author 86139
 * @Date 2020/10/21
 **/

public class PC {
   CPU cpu;
   HardDisk HD;
   public void setCPU(CPU cpu){
        this.cpu=cpu;
    }
    public void setHarDisk(HardDisk disk){
       this.HD=disk;
    }
    void show(){
        System.out.println("CPU速度"+cpu.getSpeed());
        System.out.println("硬盘容量"+HD.getAmount());

    }
}
