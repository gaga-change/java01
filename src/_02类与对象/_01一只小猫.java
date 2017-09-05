package _02类与对象;

public class _01一只小猫 {
    public static void main(String args[]) {
        Cat cat1 = new Cat(1, "gaga", "yellow");
//        cat1.age = 1;
//        cat1.name = "gaga";
//        cat1.color = "Yellow";
        System.out.println(cat1.toString());
        cat1.speak();
        cat1.speak(1);
        System.out.println(++cat1.test); // 静态变量可以由实例访问，也可以直接用类名访问。
        System.out.println(++Cat.test);
    }
}

class Cat {
    int age;
    String name;
    String color;
    static int test = 1;
    public Cat(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public void speak() {
        System.out.println("我是一只名叫" + this.name + "的猫！");
    }

    public void speak(int n) {
        System.out.println("我是一只名叫" + this.name + "的猫！" + n);
    }

    @Override
    public String toString() {
        return this.age + this.name + this.color + "/n" + super.toString();
    }
}
