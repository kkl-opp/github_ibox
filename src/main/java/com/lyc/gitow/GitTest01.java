package com.lyc.gitow;

/**
 * @author lyc
 * @version V1.0.0
 * @date 2022/6/9 9:41
 */
public class GitTest01 {
    public static void main(String[] args) {
        Animals animals = new Animals("Panda", 8);
        animals.eat();
        System.out.println("hello git ");
        System.out.println("hello git1 ");
        System.out.println("hello git2");
    }
}

class Animals {
    String name;
    int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + "吃竹子");
    }
}

