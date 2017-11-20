package object_oriented.extend;

/**
 * Created by $zhanyan on 2017/11/2.
 */
public class TestCylinder {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.3);
        cylinder.setLength(1.23);
        double area = cylinder.findArea();
        double volume = cylinder.findVolume();

        System.out.println("圆的面积为：" + area);
        System.out.println("圆柱的面积为：" + volume);

    }
}

class Cylinder extends Circle {
    private double length;//圆柱的高

    public Cylinder() {
        this.length = 1;
    }

    /**
     * 求圆柱的表面积
     *
     * @return
     */
    public double findArea() {
        return Math.PI * getRadius() * getRadius() * 2 + 2 * Math.PI  ;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume() {
        return findArea() * length;
    }

}

class Circle {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }
}
