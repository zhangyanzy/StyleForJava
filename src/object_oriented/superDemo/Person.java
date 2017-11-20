package object_oriented.superDemo;

/**
 * Created by $zhanyan on 2017/11/7.
 */
public class Person {

    protected String name;
    protected int age;
    int id = 1001;//身份证号

    public Person() {
        System.out.println("这是Person空参的构造");
        this.name = "AA";
        this.age = 1;
    }

    public Person(String name) {
        this();
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public String  getName() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PersonToString {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

class Student extends Person {
    private String schoolName;
    int id = 1002;

    public Student() {
        super();//显示
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public  Student(String schoolName) {
        super("李雷", 23);
        this.schoolName = schoolName;
    }

}

class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("北京三里屯");
        System.out.println(student.getName()+":"+student.getAge()+";"+student.getSchoolName());
        Student s = new Student();
        System.out.println(s.getName()+s.getAge());
    }
}
