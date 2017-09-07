package _02类与对象;

public class _03方法重载 {
    public static void main(String[] args) {
        System.out.println(Util.add(1,2));
        System.out.println(Util.add(1f, 2));
    }
}

class Util {
    public static int add(int a, int b) {
        return a + b;
    }


    public static float add(float a, float b) {
        return a + b;
    }
}