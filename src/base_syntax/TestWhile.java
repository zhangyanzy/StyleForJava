package base_syntax;

/**
 * Created by $zhanyan on 2017/10/16.
 */
public class TestWhile {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum = sum+i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
