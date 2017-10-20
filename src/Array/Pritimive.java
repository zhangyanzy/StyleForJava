package Array;

/**
 * Created by $zhanyan on 2017/10/12.
 */
public class Pritimive  {

    boolean[] t = new boolean[3];
}

class Array1 {
    public static void main(String[] args) {

        Pritimive d = new Pritimive();
        d.t[0] = true;
        d.t[1] = true;
        d.t[2] = true;
        for (int i = 0; i < d.t.length; i++) {
            System.out.println(d.t[i]);
        }

    }
}
