package innerDemo;

/**
 * Created by $zhanyan on 2017/12/4.
 * 内部类：
 * 1、在类的内部在定义类
 * 2、内部类的分类：成员内部类（类的内部且方法外）VS方法内部类（声明在类的方法里）
 * 3、成员内部类：
 * 是外部类的一个成员：①可以有修饰符（4种）②static  final ③：可以调用外部类的属性变量
 * 具有类的特点: ① abstract ② 可以定义其内部类的定义属性  方法  构造器
 * 4、局部内部类：
 * 5、关于内部类  大家掌握3点：
 * ①、如何创建成员内部类对象
 * ②、如何区分调用内外部类的变量
 * ③、局部内部类的使用：
 */
public class TestInnerClass {
    public static void main(String[] args) {
        Person.Dog dog = new Person.Dog();
        //
        Person p = new Person();
        Person.Brid b = p.new Brid();
        b.info();
    }
}

class Person {
    String name;
    int age;

    //成员内部类（非静态）
    class Brid {
        String name;
        int id;

        public Brid() {
        }

        public void setName(String name) {
        }

        public void info() {
            show();
        }

    }

    //成员内部类(静态内部类)
    static class Dog {

    }

    public void show() {

    }

    public void method1() {
        class A {

        }
    }

}
