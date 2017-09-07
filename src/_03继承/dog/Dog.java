package _03继承.dog;

import _03继承.*;

// 狗类
public class Dog extends Animale {
    private String color;
    public Dog() {}
    public Dog(int age, String name) {
        super(age, name);
    }
    public Dog(int age, String name, String color) {
        super(age, name);
        this.color = color;
    }

    @Override
    public void say() {
        super.say();
        System.out.println("我是一条狗！");
    }
    
    public void test() {

    }
}