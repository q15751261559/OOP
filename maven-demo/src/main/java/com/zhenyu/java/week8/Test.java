package com.zhenyu.java.week8;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 86139
 * @Date 2020/10/21
 **/

public class Test {
    public static void main(String[] args) {
        CPU cpu =new CPU();
        cpu.setSpeed(2200);
        HardDisk disk =new HardDisk();
        disk.setAmount(200);
        PC pc=new PC();
        pc.setHarDisk(disk);
        pc.setCPU(cpu);
       pc.show();
    }
}
