package interfaceDemo;

/**
 * Created by $zhanyan on 2017/11/29.
 * <p>
 * 接口（interface ）： 是与类并行的一个概念
 * 1、接口可以看做是一个特殊的抽象类。是常量与抽象方法的集合
 * 2、接口是没有构造器的  所以不可以被实例化
 * 3、接口定义的就是一种功能   此功能可以被类所实现（implements）
 * 4、实现接口的类，必须要重写其中所有的重写方法  方可以实例化
 * 5、类可以是多个接口  Java中的继承是单继承
 */
public class TestInterface  {
    public static void main(String[] args) {

    }
}
class B implements A,M{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}
interface M{
    void method3();
}

interface A {
    //常量
    int I = 12;
    public static final boolean FALG = false;

    //抽象方法
    void method1();

    public abstract void method2();


}
