package _03继承;

// 动物类
public class Animale {

    public int _public;
    protected int _protected;
    int _default;
    private int _private;

    private int age;
    private String name;
    public Animale() {
    }

    public Animale(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void say() {
        System.out.println(this.name);
        System.out.println("我是动物");
    }
}