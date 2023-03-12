package com.atguigu.java2;

import java.util.Random;

interface B {

    public static final Thread t = new Thread() {
        {
            System.out.println("interface B...");
        }
    };

    //    public static final int NUM01 = 1;
    public static final int NUM01 = new Random(10).nextInt(10);

}

/**
 * Description ==> TODO
 * BelongsProject ==> JVMDemo1
 * BelongsPackage ==> com.atguigu.java2
 * Version ==> 1.0
 * CreateTime ==> 2023-03-02 18:26:47
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class StaticMethod01 {

    public static void main(String[] args) {

//        A a = new A();

//        A.eat();

//        System.out.println(A.i01);

        System.out.println(B.NUM01);

    }
}

class A {
    static final int i01 = 2;
    static int i = 1;

    static {
        System.out.println("class A 静态方法执行...");
    }
//    static final int NUM01 = new Integer("2");


//    public static void eat(){
//        System.out.println(">>>eat");
//    }

}
