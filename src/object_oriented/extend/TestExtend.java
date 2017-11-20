package object_oriented.extend;

/**
 * Created by $zhanyan on 2017/11/2.
 */
public class TestExtend {
    public static void main(String[] args) {

        Worker worker = new Worker();
        worker.setName("Tom");
        System.out.println("worker的名字：" + worker.getName());
        Student student = new Student();
        student.setName("Jack");
        System.out.println("student的名字：" + student.getName());



    }

}
