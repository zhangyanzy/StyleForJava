package object_oriented.polymorphic;

/**
 * Created by $zhanyan on 2017/11/8.
 */
public class TestInstance {
    public static void main(String[] args) {
        TestInstance tt = new TestInstance();
        tt.method1(new Person1());
    }

    public void method1(Person1 p) {
        p.getInfo();
        if (p instanceof Graduate) {
            System.out.println("a graduate");
        }
        if (p instanceof Student) {
            System.out.println("a Student ");
        }
        if (p instanceof Person1) {
            System.out.println("a person");
        }

    }
}

class Person1 {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name: " + name + ";" + "Age: " + age;
    }

}

class Student extends Person1 {
    protected String school = "五道口职业技术学院";

    public String getInfo() {
        return "Name: " + name + ";" + "Age: " + age + "schoolName: " + school;
    }

}

class Graduate extends Student {
    protected String major = "IT";

    public String getInfo() {
        return "Name: " + name + ";" + "Age: " + age + "schoolName: " + school + "major: " + major;
    }
}

