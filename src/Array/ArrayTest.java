package Array;

/**
 * Created by $zhanyan on 2017/10/13.
 */
public class ArrayTest {

    public static void main(String[] args) {
//        int[][] arr = new int[][]{{3, 8, 7}, {2, 7}, {9, 0, 1, 6}};
        int[][] arr = new int[3][];
        arr[0] = new int[]{3, 8, 7};
        arr[1] = new int[]{2, 7};
        arr[2] = new int[]{9, 0, 1, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ",");
                sum = sum + arr[i][j];
            }
            System.out.println();
        }
        System.out.println(sum );
    }
}
