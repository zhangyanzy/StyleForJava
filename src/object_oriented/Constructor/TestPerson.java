package object_oriented.Constructor;

/**
 * Created by $zhanyan on 2017/10/30.
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Jack");
        System.out.println(person1.getName());
    }

}

class Person {

    private String name;
    private int age;

    public Person() {

    }

    //构造器
    public Person(String n, int a) {
        name = n;
        age = a;
        //空参
    }

    public Person(String n) {
        name = n;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }
}
