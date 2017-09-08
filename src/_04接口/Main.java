package _04接口;

public class Main {
    public static void main(String[] args) {
        Computed com = new Computed();
        com.usePhone(new Phone());
    }
}

interface ComputedUsb extends a,b{
    int a = 1;
    public void start();

    public void stop();
}

interface a{}
interface b{}

// 手机类
class Phone implements ComputedUsb {
    @Override
    public void start() {
        System.out.println("手机开始工作！");
    }

    @Override
    public void stop() {
        System.out.println("手机结束工作！");
    }
}

// 电脑类
class Computed {
    public void usePhone(ComputedUsb phone){
        phone.start();
        phone.stop();
    }
}