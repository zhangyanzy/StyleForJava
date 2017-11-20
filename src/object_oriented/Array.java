package object_oriented;

/**
 * Created by $zhanyan on 2017/10/23.
 */
public class Array  {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 43, 9, 0, -65, -99, 100, 9};

        /**
         * 求最大值
         */
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("最大值为： " + max);

        /**
         * 求最小值
         */
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("最小值为： " + min);
    }
}
