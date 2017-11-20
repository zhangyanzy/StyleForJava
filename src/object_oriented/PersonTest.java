package object_oriented;

/**
 * Created by $zhanyan on 2017/10/19.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 12;
        person.name = "花花";
        person.study();
        System.out.println("--------------------");
        System.out.println(person.age + "&&" + person.name);
        Person p1 = new Person();
        System.out.println(p1.age + "&&" + p1  .name);
        person.addAge(2);

    }
}

class Person {
    public String name;
    public int age;
    public int sex;

    public void study() {
        System.out.println("study");
    }

    public void showAge() {
        System.out.println(age);
    }

    public int addAge(int i) {
        age = age + i;
        return age;
    }
}
