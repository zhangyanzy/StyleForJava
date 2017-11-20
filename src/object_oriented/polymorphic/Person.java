package object_oriented.polymorphic;

/**
 * Created by $zhanyan on 2017/11/7.
 */
public class Person {

    private String name;
    private int age;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void work() {
        System.out.println("走路");
    }

    public void eat() {
        System.out.println("吃饭");
    }

}

class Man extends Person {

    private boolean smoking;

    public Man() {
        super();
    }

    public Man(boolean smoking) {
        super();
        this.smoking = smoking;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public void work() {
        System.out.println("男人笔挺走路");
    }

    public void eat() {
        System.out.println("男人大口吃肉");
    }

    public void enter() {
        System.out.println("男人请客");
    }

}

class Woman extends Person {

    private boolean isBeauty;

    public Woman() {

    }

    public Woman(boolean isBeauty) {
        super();
        this.isBeauty = isBeauty;
    }

    public void work() {
        System.out.println("女人走路");
    }

    public void eat() {
        System.out.println("女人吃饭");
    }

    public void shopping() {
        System.out.println("女人购物");
    }

}

/**
 * 多态性：
 * 1、多态性是指一个事物的多种表现形态。
 * 1）方法的重载与重写
 * 2）子类对象的多态性
 * 2.子类对象的多态性  使用的前提：
 * 1）：要有类的继承
 * 2）:要有父类方法的重写
 * 3);程序运行分为编译状态和运行状态
 * 对于多态来说  编译时看“左边”认为此引用变量理解为父类的类型
 * 当运行时  看“右边”关于与真正的实体 子类的对象，那么执行的方法就是子类重写的
 */

class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();

        //子类对象的多态性,父类的引用指向子类对象
        Person p1 = new Man();//向上转型
        //虚拟方法调用 通过父类的引用指向子类的实体对象  当调用方法时  实际自行的是子类重写父类的方法
        p1.eat();
        p1.work();

        Person p2 = new Woman();
        p2.eat();
        p2.work();

        //向下转型 类似于强转
        Woman w = (Woman) p2;
        w.shopping();

    }

}
