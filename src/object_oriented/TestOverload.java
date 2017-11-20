package object_oriented;

/**
 * Created by $zhanyan on 2017/10/23.
 */
public class TestOverload {
    public static void main(String[] args) {
        OverLoad overLoad = new OverLoad();

    }
}

class OverLoad {

    //定义两个int形变量的和
    public int getSum(int i, int j) {
        return i + j;
    }

    //定义三个int形变量的和
    public int getSum(int i, int j, int k) {
        return i + j + k;
    }

    //定义两个double类型的数据的he
    public double getSum(double d1, double d2) {
        return d1 + d2;

    }

    //定义三个double类型的数据的和
    public void getSum(double d1, double d2, double d3) {
        System.out.println(d1 + d2 + d3);
    }

}
