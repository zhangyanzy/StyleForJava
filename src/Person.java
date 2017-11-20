/**
 * Created by $zhanyan on 2017/11/16.
 */
public class Person {

    private String userName;
    private int age;

    public Person() {
        this.userName = "Tom";
        this.age = 12;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.getUserName());
        System.out.println(p1.getAge());


    }
}
