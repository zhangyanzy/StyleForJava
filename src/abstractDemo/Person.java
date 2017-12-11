package abstractDemo;

/**
 * Created by $zhanyan on 2017/11/22.
 * abstract：抽象的 可以用来修饰类、方法
 * <p>
 * abstract修饰类 ：抽象类
 * 1、不可以被实例化
 * 2、抽象类有构造器(凡是类都有构造器)
 * 3、抽象方法所在的抽象类一定都是抽象类
 * 4、抽象类中可以没有抽象方法
 * <p>
 * <p>
 * abstract修饰方法： 抽象方法
 * 1、格式：没有方法体也没有大括号
 * 例如：  public abstract void eat();
 * 2、抽象方法只保留方法的功能   而具体执行的方法  交给继承抽象类的子类去实现
 * 3、若子类继承抽象类  并重写了所有的抽象方法，则此类是一个“实体类”，即可以实例化
 * 4、若子类没有重写所有的抽象方法  意味着此类中还有抽象方法  则此类必须声明为抽象的
 */

class TestAbstract {
    public static void main(String[] args) {

    }
}

abstract class Creator {

    public abstract void breath();
}

abstract class Person extends Creator{

    public Person() {

    }

    public abstract void eat();

    public abstract void walk();
}

class Sutdent extends Person {

    public void eat() {
        System.out.println("学生吃饭");
    }

    @Override
    public void walk() {

    }

    @Override
    public void breath() {

    }
}

abstract class Worker extends Person {

    public void eat() {
        System.out.println("工人吃饭");
    }

    public void walk() {
        System.out.println("工人走路");
    }

}


