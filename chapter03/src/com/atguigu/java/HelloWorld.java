package com.atguigu.java;

import java.util.Arrays;

/**
 * @author shkstart
 * @create 2020-09-13 15:31
 */
public class HelloWorld {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("hello,world!");

        Object o = new Object();

        Class<?> aClass = o.getClass().getClassLoader().loadClass("com.atguigu.java.Yukino");

        System.out.println(Arrays.toString(aClass.getDeclaredFields()));

//        Class<?> aClass = ClassLoader.getSystemClassLoader().loadClass("com.atguigu.java.Yukino");
//
//        System.out.println(Arrays.toString(aClass.getDeclaredFields()));





    }



}
