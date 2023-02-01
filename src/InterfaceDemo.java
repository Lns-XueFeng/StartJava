public class InterfaceDemo {
    public static void main(String... args) {
        Compute compute = new Compute();
        IUsb phone = new Phone();
        compute.useUsb(phone);

        IUsb camera = new Camera();
        compute.useUsb(camera);

        AbstractUsb fen = new Fen();
        compute.useAUsb(fen);
    }
}

interface IUsb {
    // 接口类中的成员变量默认有且只能public static final
    public static final String INTER = "IN";
    String NTR = "NI";

    // 默认且只能是 public abstract
    void start();
    public abstract void close();
}

abstract class AbstractUsb {
    // 抽象类的成员变量可为各种类型
    private static final int NUM = 6;
    protected static float fl = 1.1f;

    // 只能存在public abstract方法
    protected abstract void start();
}

class Phone implements IUsb {
    public void start() {
        System.out.println("我是手机，开始工作...");
    }

    public void close() {
        System.out.println("我是手机，结束工作...");
    }
}

class Camera implements IUsb {
    public void start() {
        System.out.println("我是相机，开始工作...");
    }

    public void close() {
        System.out.println("我是相机，结束工作...");
    }
}

class Fen extends AbstractUsb {
    protected void start() {
        System.out.println("我是风扇，开始工作...");
    }
}

class Compute {
    Compute() {
        System.out.println("电脑开机啦");
    }

    void useUsb(IUsb usb) {
        usb.start();
        usb.close();
    }

    void useAUsb(AbstractUsb AUsb) {
        AUsb.start();
    }
}
