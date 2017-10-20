package base_syntax;

/**
 * Created by $zhanyan on 2017/10/16.
 */
public class TestFor {
    public static void main(String[] args) {
        /**
         *  循环顺序
         */
//        int j = 1;
//        for (System.out.print('a'); j < 3; System.out.print('b'), j++) {
//            System.out.print('c');

        /**
         * 遍历1-100的偶数
         * 求偶数和
         * 1-100的偶数个数
         */
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum = sum + i;
                count++;
            }
        }
        System.out.println("1-100的偶数和 ：" + sum);
        System.out.println("1-100的偶数个数 ：" + count);
    }

}
