package object_oriented.encapsulation;

/**
 * Created by $zhanyan on 2017/10/30.
 */
public class TestTriAngle {
    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle();
        triAngle.setBase(15);
        triAngle.setHeight(7);
        double area = triAngle.area();
        System.out.println(area);


    }
}

class TriAngle {
    private double base;
    private double height;

    public TriAngle() {

    }

    public double area() {
        return 0.5 * (base * height);
    }

    public void setBase(double b) {
        base = b;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getHeight() {
        return height;
    }
}
