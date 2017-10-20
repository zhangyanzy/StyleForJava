package base_syntax;

/**
 * Created by $zhanyan on 2017/10/16.
 */
public class FooBizBaz {
    public static void main(String[] args) {

        for (int i = 1; i <= 150; i++) {
            System.out.print(i + " ");

            if (i % 3 == 0) {
                System.out.print("foo ");
            }
            if (i % 5 == 0) {
                System.out.print("biz ");
            }
            if (i % 7 == 0) {
                System.out.print("baz ");
            }
            System.out.println();
        }

        int count = 0;
        for (int i = 1; i <= 150; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总和 "+count);
    }
}
