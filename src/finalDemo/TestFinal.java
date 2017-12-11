package finalDemo;

/**
 * Created by $zhanyan on 2017/11/22.
 * <p>
 * final表示为最终的 可以用来修饰类、属性 、方法
 * 1、修饰类 不能被继承
 * 2、修饰方法   不能被重写
 * 3、修饰属性（常量）  习惯性用大写表示，常量不可以默认初始化
 * 4、static final 全局常量
 */
public class TestFinal {
}

class D {
    private final int I;

    {
        I = 19;
    }

    public void getI(final int w) {
        System.out.println(I);
    }

}