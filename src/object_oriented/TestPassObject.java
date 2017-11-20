package object_oriented;

/**
 * Created by $zhanyan on 2017/10/25.
 */
public class TestPassObject {
    public static void main(String[] args) {
        Circle circle = new Circle();
        PassObject passObject = new PassObject();
        passObject.printAreas(circle,5);

    }

}

class PassObject {

    public void printAreas(Circle circle, int time) {
        System.out.println("Radius" + "\t\t" + "Area");
        int temp = 0;
        for (int i = 1; i <= time; i++,temp = i) {
            circle.setRadius(i);
//            System.out.println(circle.getCirclrArea() + "\t\t" + circle.findArea()     );
        System.out.println(new Circle().getCirclrArea());
        }
        circle.setRadius(temp);
    }
}

class CircleTest {

    public double radius;

    public double findArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public void setRadius(double r) {
        radius = r;
    }

    private double getRadius() {
        return radius;
    }
}
