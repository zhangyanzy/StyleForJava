package object_oriented.superDemo;

/**
 * Created by $zhanyan on 2017/11/7.
 */
public class TestDog {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setAge(10);
        d.setName("Jack");
        d.setHostName("小明");
        System.out.println(d.getName()+d.getAge()+d.getHostName());
    }


}

//生物
class Creator {
    private int age;

    public Creator() {
        super();
        System.out.println("This is Creator constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

//动物
class Animal extends Creator {
    private String name;

    public Animal() {
        super();
        System.out.println("This is Animal constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//狗
class Dog extends Animal {
    private String hostName;

    public Dog() {
        super();
        System.out.println("This is Dog constructor");
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
}
