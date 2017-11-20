package staticDemo;

/**
 * Created by $zhanyan on 2017/11/20.
 * static: 静态  可以用来修饰属性 方法  代码块  内部类
 * <p>
 * static修饰属性（类变量）：
 * 1、由类创建的所有的对象都公用这一个属性
 * 2、当其中一个对象对此属性进行修改，会导致其他对象对此属性的一个调用  vs 实例变量（非static修饰属性  个自都有个自的的东西）
 * 3、随着类的加载而加载的，独一份
 * 4、静态变量可以直接通过“类”.“属性”的形式来调用
 * 5、类变量的加载是要早于对象的
 * 6、类变量是存在于静态域中
 * <p>
 * <p>
 * <p>
 * static修饰方法：（类方法）
 * 1、随着类的加载而加载  在内存中也是独一份
 * 2、可以直接通过“类.类方法”的方式调用
 * 3、内部可以调用静态的方法和属性，而不能调用非静态的、非静态的方法是可以调用静态方法的
 * 在静态的方法内是不可以有this和super关键字的
 * <p>
 * 注意：静态的结构（static属性 方法  代码块 内部类）的生命周期要早于非静态结构   同时被回收也要晚于非静态
 */
public class TestSportsMan {
    public static void main(String[] args) {
        SportsMan s1 = new SportsMan("金龙", 12);
        SportsMan s2 = new SportsMan("银龙", 13);
        s1.name = "花花";
        s1.nation = "china";
        SportsMan.show();
        System.out.println(s1);
        System.out.println(s2);
    }
}

class SportsMan {
    String name;
    int age;
    static String nation;

    public SportsMan(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    @Override
    public String toString() {
        return "SportsMan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                '}';
    }

    public void show1() {
        System.out.println("age" + age);
        System.out.println("我是一个来自中过的运动员");
    }

    public static void show() {
        System.out.println("nation" + nation);
        System.out.println("我是一个来自中过的运动员");
        info();
    }

    public static void info() {
        System.out.println("静态方法");
    }
}
