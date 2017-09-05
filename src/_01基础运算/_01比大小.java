package _01基础运算;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _01比大小 {
    public static void main(String args[]) {
        try {
            // 输入流, 从键盘中收数
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            // 从控制台读取数据
            System.out.println("请输入第一个数");
            String a1 = br.readLine();
            System.out.println("请输入第二个数");
            String a2 = br.readLine();
            float f1 = Float.parseFloat(a1);
            float f2 = Float.parseFloat(a2);
            Boolean b = f1 > f2;
            System.out.println(b.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
