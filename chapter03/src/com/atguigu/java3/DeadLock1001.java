package com.atguigu.java3;

import java.util.concurrent.TimeUnit;

public class DeadLock1001 {

    public static void main(String[] args) {

        Object o01 = new Object();
        Object o02 = new Object();

        new Thread(()->{
            synchronized (o01){
                System.out.println("AA");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o02){

                }
            }
        },"T1").start();

        new Thread(()->{
            synchronized (o02){
                System.out.println("BB");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o01){

                }
            }
        },"T2").start();



    }

}
