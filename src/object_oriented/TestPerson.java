package object_oriented;

/**
 * Created by $zhanyan on 2017/10/17.
 */
public class TestPerson {
    public static void main(String[] args) {

        Per person = new Per();
        person.name = "zhang";
        person.age = 24;
        person.info();
        person.setName("zhangyan");
        person.info();

    }

}

class Per {

    public String name;
    public int age;
    public boolean sex;

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public String getNama() {
        return name;
    }

    public void setName(String userName) {
        name = userName;
    }

    public void info() {
        eat();
        sleep();
        System.out.println(name + "、" + age);
    }

}
