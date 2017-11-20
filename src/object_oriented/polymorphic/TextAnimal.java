package object_oriented.polymorphic;

/**
 * Created by $zhanyan on 2017/11/7.
 *
 */
public class TextAnimal {
    public static void main(String[] args) {
        TextAnimal ta = new TextAnimal();
        ta.function(new Dog());

    }
    public void function(Animal animal){
        animal.eat();
    }

}

class Animal {
    String name;
    int age;

    public void eat() {
        System.out.println("进食");
    }

    public void jump() {
        System.out.println("跳跃");
    }
}

class Dog extends Animal {

    public void eat() {
        System.out.println("狗吃狗粮");
    }

    public void jump() {
        System.out.println("狗急跳墙");
    }

    public void wang() {
        System.out.println("旺旺叫");
    }
}

class Cat extends Animal {

    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void jump() {
        System.out.println("猫跳");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }

}