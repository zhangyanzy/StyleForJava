package object_oriented.extend;

/**
 * Created by $zhanyan on 2017/11/2.
 */
public class Person {

    protected String name;
    private int age;

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

    public void eat() {
        System.out.println("eat");
    }

}
