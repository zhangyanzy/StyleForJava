package object_oriented;

/**
 * Created by $zhanyan on 2017/10/23.
 */
public class TestMethodOverLoad {
    public static void main(String[] args) {
        MethodOverLoad methodOverLoad = new MethodOverLoad();
        System.out.println(methodOverLoad.mOL(3));
        System.out.println(methodOverLoad.mOL(3, 5));
        methodOverLoad.mOL("123456");
        System.out.println(methodOverLoad.max(1, 2));
        System.out.println(methodOverLoad.max(1, 2, 3));

    }

}

class MethodOverLoad {

    public int mOL(int a) {
        return a * a;
    }

    public int mOL(int a, int b) {
        return a * b;
    }

    public void mOL(String str) {
        System.out.println(str);
    }

    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public double max(double a, double b) {
        double max = a;
        if (a < b) {
            max = b;
        }
        return max;
    }

    public double max(double a, double b, double c) {
        return (max(a, b) > c) ? max(a, b) : c;
    }


}
