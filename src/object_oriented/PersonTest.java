package object_oriented;

/**
 * Created by $zhanyan on 2017/10/19.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 12;
        person.study();
//        person.age
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
