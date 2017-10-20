package Array;

/**
 * Created by $zhanyan on 2017/10/12.
 */
public class ArrayException {
    public static void main(String[] args) {
        /**
         * 数组下标越界的异常
         */
        int[] arr = new int[10];
        arr[0] = 1;
//        arr[10] = 10;

//        for (int i = 0; i <= arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        /**
         * 控制异常
         */
        boolean[] b = new boolean[3];
        System.out.println();

        int[][] j = new int[3 ][];
        j[2][0] = 12;
    }
}
