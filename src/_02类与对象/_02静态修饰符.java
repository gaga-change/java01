package _02类与对象;

public class _02静态修饰符 {
    static int i = 1;
    static {
        // 该静态区域块，只会执行一次
        System.out.println("静态代码块执行");
        i ++;
    }
    public _02静态修饰符(){
        System.out.println("构造函数执行");
        i ++;
    }
    public static void main(String args[]){
        System.out.println("Main函数执行");
//        System.out.println(_02静态修饰符.i); // 2
//        _02静态修饰符 a = new _02静态修饰符();
//        System.out.println(_02静态修饰符.i); // 3
//        _02静态修饰符 b = new _02静态修饰符();
//        System.out.println(_02静态修饰符.i); // 4
        Math m = new Math();
        System.out.println(Math.add(1));
        System.out.println(Math.test);
        System.out.println(m.getTest());
    }
}
class Math {
    static int test = 1;
    public static int add(int num) {
        Math.test ++;
        return ++num;
    }
    public int getTest() {
        return Math.test;
    }
}
