package com.atguigu.java;

/**
 * Description ==> TODO
 * BelongsProject ==> JVMDemo1
 * BelongsPackage ==> com.atguigu.java
 * Version ==> 1.0
 * CreateTime ==> 2023-03-06 19:39:50
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class Yukino {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Yukino{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
