package base_syntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by $zhanyan on 2017/10/9.
 */
public class IfElse {

    public static void main(String[] args) {
        wife();
        maoPao();
    }

    private static void maoPao() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = scanner.nextInt();
        System.out.println("请输入第三个数：");
        int num3 = scanner.nextInt();

        int arr[] = {num1, num2, num3};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {

        }

         if (num1 > num2) {
            if (num3 > num1) {
                System.out.println(num2 + "," + num1 + "," + num3);
            } else if (num3 > num2) {
                System.out.println(num3 + "," + num2 + "," + num1);
            } else {
                System.out.println(num2 + "," + num3 + "," + num1);
            }
        } else {
            if (num3 > num2) {
                System.out.println(num1 + "," + num2 + "," + num3);
            } else if (num3 < num1) {
                System.out.println(num3 + "," + num1 + "," + num2);
            } else {
                System.out.println(num1 + "," + num3 + "," + num2);
            }
        }

    }

    private static void wife() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身高：");
        int num1 = scanner.nextInt();
        System.out.println("资产1万：");
        double num2 = scanner.nextDouble();
        System.out.println("帅？：");
        boolean num3 = scanner.nextBoolean();
        if (num1 > 180 && num2 > 10000 && num3) {
            System.out.println("嫁");
        } else if (num1 > 180 || num2 > 10000 || num3) {
            System.out.println("可以");
        } else {
            System.out.println("out");
        }
    }

}
