package object_oriented;

import java.util.Arrays;

/**
 * Created by $zhanyan on 2017/10/23.
 */
public class TestArrayUtil {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 43, 9, 0, -65, -99, 100, 9};
//        Arrays.sort(arr);

        ArrayUtil arrayUtil = new ArrayUtil();

        int max = arrayUtil.getMax(arr);
        System.out.println("最大值为： " + max);
        int min = arrayUtil.getMin(arr);
        System.out.println("最小值为： " + min);
        arrayUtil.printArray(arr);
        double avg = arrayUtil.getAvg(arr);
        System.out.println("平均值为： " + avg);
        int sum = arrayUtil.getSum(arr);
        System.out.println("总和为： " + sum);

        arrayUtil.sort(arr, "desc");
    }
}