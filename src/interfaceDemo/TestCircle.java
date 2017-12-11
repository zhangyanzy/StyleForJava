package interfaceDemo;

/**
 * Created by $zhanyan on 2017/12/4.
 */
public class TestCircle {

}

interface CompareTo {
    int compareTo(Object o);
}

class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class ComparableCircle extends Circle implements CompareTo {

    @Override
    public int compareTo(Object o) {
        return 0;

    }
}
