package singleton;

/**
 * Created by $zhanyan on 2017/11/20.
 * <p>
 * 单例：
 * 解决的问题： 使得一个类只能够创建一个对象
 * 如何实现：
 * 饿汉式
 */
class TestSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getmInstance();
        Singleton s2 = Singleton.getmInstance();
        System.out.println(s1 == s2);
    }
}

class Singleton {
    /**
     * 1.私有化构造器,使得在类的外部不能调用此构造器
     */
    private Singleton() {

    }

    /**
     * 2.在类的内部创建一个类的实例
     */
    private static Singleton mInstance = new Singleton();
    /**
     * 3、私有化此对象 通过公共方法调用
     */
    /**
     * 4、此公共方法  只能通过类来调用 因为设置为static的 同时类的实例也同为static
     */
    public static Singleton getmInstance() {
        return mInstance;
    }
}

