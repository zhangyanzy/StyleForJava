package Array;

import com.sun.xml.internal.stream.buffer.sax.SAXBufferCreator;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by $zhanyan on 2017/10/24.
 */
public class BookArray {
    public static void main(String[] args) {

//        int[] a = new int[100];
//        int[] arr = {17, 19, 23, 29, 31, 37};
//        System.out.println(Arrays.toString(arr));
//        a = arr;
//        System.out.println(Arrays.toString(a));
//        a = Arrays.copyOf(arr, arr.length);
//        System.out.println(Arrays.toString(a));
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//        System.out.println(a.length);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("how many number do you need to draw");
//        int k = scanner.nextInt();
//        System.out.println("what is the highest number you can draw");
//        int n = scanner.nextInt();
//
//        int[] number = new int[n];
//        for (int i = 0; i < number.length; i++) {
//            number[i] = i + 1;
//        }
//        int[] result = new int[k];
//        for (int i = 0; i < result.length; i++) {
//            int r = (int) (Math.random() * n);
//            result[i] = number[r];
//            number[r] = number[n - 1];
//            n--;
//        }
//        Arrays.sort(result);
//
        int[] numbers = new int[8];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));

        int[] result = new int[8];
        int r = (int) (Math.random() * 8);
    }
}
