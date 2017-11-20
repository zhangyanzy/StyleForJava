package object_oriented;


/**
 * Created by $zhanyan on 2017/10/25.
 */
public class TestArgs {

    public static void main(String[] args) {
        TestArgs testArgs = new TestArgs();
        testArgs.sayHello();
        testArgs.sayHello("sayHello");
        testArgs.sayHello("beijing", "shanghai");
        testArgs.sayHello1(new String[]{"beijing", "shanghai"});
    }

    //如下三个方法构成重载
    private void sayHello() {
        System.out.println("hello");
    }

    private void sayHello(String str) {
        System.out.println("hello" + str);
    }

    private void sayHello1(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    /**
     * 可变个数的形参
     *
     * @param args
     */
    private void sayHello(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }


}
