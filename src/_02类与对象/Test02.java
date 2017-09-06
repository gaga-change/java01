package _02类与对象;

public class Test02 {
    public static void main(String[] args) {
        Dog d = new Dog();
        int a = d._public;
        a = d._protected;
        a = d._default;
    }
}
class Dog {
    public int _public;
    protected int _protected;
    int _default;
    private int _private;
}