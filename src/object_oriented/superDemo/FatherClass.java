package object_oriented.superDemo;

/**
 * Created by $zhanyan on 2017/11/2.
 */

class TestClass {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.f();
    }
}


public class FatherClass {
    public int value;

    public FatherClass() {

    }

    public void f() {
        value = 100;
        System.out.println("父类的value值 = " + value);
    }
}

class ChildClass extends FatherClass {
    /**
     * 父类拥有了一个value属性，子类继承父类会拥有一个value属性
     * 子类另外有声明了一个value属性
     * 就等于子类中有两个value属性
     */
    public int value;

    public ChildClass() {
        super();
    }

    public ChildClass(int value){
        super();
        this.value = value;
    }

    /**
     * 在子类中重写了父类中的f()方法   即重写了f()中的方法体
     */
    public void f() {
        super.f();//使用super作为父类对象的引用来调用父类中f()方法
        value = 200;//这个是子类中自定义的value值 = this.value = 200;
        System.out.println("子类的value值" + value);
        System.out.println(value);//子类自定义的value值  = 200；
        /**
         *   打印出来的是父类中的value值，由于子类在重写父类继承下来的f()方法时，
         *   第一句话 super.f()是让父类对象的引用调用了父类中的f()方法
         *   相当于是这个父类对象自己调用了f()方法去改变自己的value属性值   从0变成了100
         *   所以这里打印出的出来的value值是100
         */
        System.out.println(super.value);
    }

}

