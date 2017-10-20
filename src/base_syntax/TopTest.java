package base_syntax;


import java.util.Scanner;

/**
 * Created by $zhanyan on 2017/10/16.
 */
public class TopTest {
    private static Scanner scanner;

    public static void main(String[] args) {
        infinite();

    }

    private static void infinite() {
        scanner = new Scanner(System.in);
        int a = 0;//正数
        int b = 0;
        for (; ; ) {
            System.out.println("请输入一个整数：");
            int num = scanner.nextInt();
            if (num > 0) {
                a++;
            } else if (num < 0) {
                b++;
            }else {
                break;
            }
        }
        System.out.println("正数的个数为： " + a);
        System.out.println("正数的个数为： " + b);
    }
}
