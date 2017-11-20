package object_oriented.encapsulation;


/**
 * Created by $zhanyan on 2017/10/30.
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Tom");
        animal.setLegs(4);
        animal.info();
        animal.sleep();
        System.out.println(animal.getName());

    }

}

class Animal {

    private String name;
    private int legs;

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public void eat() {
        System.out.println("eat");
    }

    public void sleep() {
        System.out.println("sleep");
    }

    public void info() {
        System.out.println("name = " + name + ";" + "legs = " + legs);
    }

    public void setLegs(int l) {
        if (l > 0 && l % 2 == 0) {
            legs = l;
        } else {
            System.out.println("您输入的数据有问题");
        }
    }

    public void setName(String n) {
        name = n;
    }
}
