package _05数组;

public class Main {
    public static void main(String[] args) {
        int a[] = new int[50];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.floor(Math.random() * 10);
        }
        for (int k : a) {
            System.out.println(k);
        }

    }
}
