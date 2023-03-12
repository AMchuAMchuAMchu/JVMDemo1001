package com.atguigu.java3;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ArrayListTest1001 {

    public static void main(String[] args) {

        ArrayList<Object> arrayList = new ArrayList<>();

        for (;;) {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Byte [] integers = new Byte[1024*1024];
            arrayList.add(integers);
        }
//        jstat -gc -h10 5704 500 1000


    }


}
