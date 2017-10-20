package base_syntax;

/**
 * Created by $zhanyan on 2017/10/16.
 */
public class DoubleFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");

        for (int j = 0; j < 5; j++) {  //控制行数
            for (int i = 0; i < 1 + j; i++) { //控制列数
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------九九乘法表----------------------");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();

        }
        System.out.println("-----------------------输出1-100以内的质数----------------------");

        /**
         *  质数：
         */
//        boolean flag = false;
//        long start = System.currentTimeMillis();
//        for (int i = 2; i <= 100; i++) {
//            //如何判断是否为质数
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    flag = true;
//                }
//            }
//            if (!flag) {
//                System.out.println(i);
//            }
//            flag = false;
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("所花费的时间 ：" + (end - start));


        boolean flag = false;
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.println(i);
            }
            flag = false;
        }

    }

}
