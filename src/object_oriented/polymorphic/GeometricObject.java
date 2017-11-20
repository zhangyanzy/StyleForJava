package object_oriented.polymorphic;

/**
 * Created by $zhanyan on 2017/11/8.
 */
//几何形状
public class GeometricObject {

    protected String color;
    protected double weight;

    public GeometricObject() {
        super();
    }

    protected GeometricObject(String color, double weight) {
        super();
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea() {
        return 0.0;
    }
}

//圆形
class Circle extends GeometricObject {

    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
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

//矩形
class MyRectangle extends GeometricObject {
    private double width;
    private double height;

    public MyRectangle(double width, double height, String color, double weight) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea() {
        return width * height;
    }
}

class Test {
    public static void main(String[] args) {
        Test t = new Test();
        Circle c = new Circle("green", 2.3, 1.0);
        Circle c1 = new Circle("Red", 2.3, 1.0);
        MyRectangle m = new MyRectangle(2.3, 3.0, "blue", 2.0);
        t.disPlayGeometricObject(m);
        boolean b = t.equalsArea(c, c1);
        System.out.println(b);

    }

    //判断两个对象的面积是否相等
    public boolean equalsArea(GeometricObject o1, GeometricObject o2) {
        if (o1.findArea() == o2.findArea()) {
            return true;
        } else {
            return false;
        }
    }

    public void disPlayGeometricObject(GeometricObject o) {
        System.out.println(o.findArea());
    }

}
