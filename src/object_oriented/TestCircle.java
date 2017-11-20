package object_oriented;

/**
 * Created by $zhanyan on 2017/10/23.
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
//        circle.radius = 2.3;
//        double circlrArea = circle.getCirclrArea();
//        System.out.println("圆的面积为：" +circlrArea);
        circle.setRadius(4.5);
        System.out.println(circle.getCirclrArea());

    }

}

/**
 * 3.14 * 半径 * 半径
 */
class Circle {
    public double radius;

//        public void getCirclrArea() {
//        System.out.println("圆的面积为：" + 3.14 * radius * radius);
//    }
    public double getCirclrArea() {
        return Math.PI * radius * radius;
    }
    //返回圆的半径
    public double findArea(){
        return radius;
    }
    //设置圆的半径
    public void setRadius(double r){
        radius = r;
    }
}