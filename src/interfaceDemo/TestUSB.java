package interfaceDemo;

/**
 * Created by $zhanyan on 2017/12/4.
 */
public class TestUSB {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        Printer p = new Printer();
        c1.doWork(p);

        USB phone = new USB() {

            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机停止工作");
            }
        };
        c1.doWork(phone);
    }
}

interface USB {


    void start();

    void stop();
}

class Computer {
    public void doWork(USB usb) {
        usb.start();
        System.out.println("...此设备开始工作...");
        usb.stop();
    }
}

class Flash implements USB {

    @Override
    public void start() {
        System.out.println("U盘开始工作");

    }

    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}

class Printer implements USB {

    @Override
    public void start() {
        System.out.println("打印机开始工作");

    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}
