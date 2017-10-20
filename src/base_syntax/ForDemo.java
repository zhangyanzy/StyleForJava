package base_syntax;

import java.util.Scanner;

/**
 * Created by $zhanyan on 2017/10/9.
 */
public class ForDemo {

    public static void main(String args[]) {
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);

//        for (int i = 1; i <= 150; i++) {
//            System.out.print(i + " ");
//            if (i % 3 == 0) {
//                System.out.print("foo");
//            } else if (i % 5 == 0) {
//                System.out.print("biz");
//            } else if (i % 7 == 0){
//                System.out.print("baz");
//            }
//            System.out.println();
//        }


//        for (int i = 100; i < 1000; i++) {
//            //456
//            int j1 = i / 100;
//            int j2 = (i - j1 * 100) / 10;
//            int j3 = i % 10;
//            if (i == j1 * j1 * j1 + j2 * j2 * j2 + j3 * j3 * j3) {
//                System.out.println(i);
//            }
//        }

//        while 循环
//        int i = 1;
//        int sum = 0;
//        while (i <= 100) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//                sum = sum + i;
//            }
//            i++;
//        }
//        System.out.println(sum);

        //    do  while
//        int i = 1;
//        do {
//            if (i%2==0){
//                System.out.println(i);
//            }
//            i++;
//        }while (i<=100);
//


//        Scanner scanner = new Scanner(System.in);
//        int a = 0;//记录整数
//        int b = 0;//记录负数
//        for (; ; ) {
////            System.out.println("请输入第 " + (i + 1) + "个整数");
//            System.out.println("请输入一个整数： ");
//            int num = scanner.nextInt();
//            if (num > 0) {
//                a++;
//            } else if (num < 0) {
//                b++;
//            } else {
//                break;
//            }
//        }
//        System.out.println("正数的个数为：" + a);
//        System.out.println("负数的个数为：" + b);


        /**
         * 循环嵌套
         */
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println("****************************************************");
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        System.out.println("****************************************************");
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5 - i; j ++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < 5; i++) {
//            for (int k = 0; k < 4 - i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < 4; i++) {
//            for (int k = 0; k < i + 1; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 4 - i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        for (int i = 1; i <= 9; i++) {//控制有9行
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i + "*" + j + "=" + i * j + "\t");
//            }
//            System.out.println();
//        }
        boolean flag = false;
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println(i);
            }
            flag = false;
        }

    }

}

