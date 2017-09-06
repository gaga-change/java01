package _03继承;
import _03继承.dog.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(1, "小黄", "黄色");
        dog.say();
        int t = dog._public;
        t = dog._protected;
//        t = dog._default; // 必须是同包下的，如果Dog类在_03继承包下，则这个属性可以被子类实例调用。
    }
}



