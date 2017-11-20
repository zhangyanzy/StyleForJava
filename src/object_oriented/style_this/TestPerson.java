package object_oriented.style_this;

/**
 * Created by $zhanyan on 2017/10/31.
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(10);

    }
}

class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String n) {
        this.name = n;
    }

    public Person(String n, int a) {
        this.name = n;
        this.age = a;

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void info() {
        System.out.println("name: " + name + "," + "age: " + age);
    }

}
