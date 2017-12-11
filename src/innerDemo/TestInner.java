package innerDemo;

/**
 * Created by $zhanyan on 2017/12/4.
 * 局部内部类
 */
public class TestInner {

}

class OuterClass {
    //局部内部类
    public void method() {
        //在方法内定义类
        class InnerClass {

        }
    }

}
