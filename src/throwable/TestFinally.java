package throwable;

/**
 * Created by $zhanyan on 2017/12/5.
 */
public class TestFinally {
    public static void main(String[] args) {
        int i = method1();
        System.out.println(i);

    }

    public static int method1() {
        try {
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("hello");
            return 2;
        }
    }
}
