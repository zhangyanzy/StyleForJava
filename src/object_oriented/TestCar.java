package object_oriented;

/**
 * Created by $zhanyan on 2017/10/24.
 */
public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
//        car.info("zhang", 21);
        car.name = "zhang";
        car.wheel = 21;
    }

}

class Factory{

    public Car makeCar(){
        return new Car();
    }
    public Car makeCar(String n,int w){
         Car c = new Car();
         c.name = n;
         c.wheel = w;
         return c;
    }
    public void desceibeCar(Car c){

    }
}

class Car {

    public String name;
    public int wheel;

    //    public void info(String n, int w) {
//        name = n;
//        wheel = w;
//        System.out.println(name + "、" + wheel);
//    }
    public void info() {

        show();
        System.out.println(name + "、" + wheel);
    }

    public void show() {
        System.out.println("l am a car");
    }

    public String getName() {
        return name;
    }
}
