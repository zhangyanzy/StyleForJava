package object_oriented.encapsulation;

/**
 * Created by $zhanyan on 2017/10/30.
 */
public class TextPerson {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Tom", 5);
        System.out.println(person1.getName() + ":" + person1.getAge());
    }
}

class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int i) {
        if (i <= 130 && i >= 0) {
            age = i;
        } else {
            throw new RuntimeException("输入的数据有误");
        }
    }

    public int getAge() {
        return age;
    }
}
