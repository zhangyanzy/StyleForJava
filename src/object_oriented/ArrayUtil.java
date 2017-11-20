package object_oriented;

/**
 * Created by $zhanyan on 2017/10/23.
 */
public class ArrayUtil {
    //数组的最大值
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //数组的最小值
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    //遍历数组的元素
    public void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "、");
        }
        System.out.println("]");

    }

    //求数组的平均值
    public double getAvg(int[] arr) {
        int avg = 0;
        int sum = getSum(arr);
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
        avg = sum / arr.length;
        return avg;
    }

    //求数组的总和
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    //数组的反转
    public int[] reverse(int[] arr) {
        for (int x = 0, y = arr.length - 1; x < y; x++, y--) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        return arr;
    }

    //数组的复制
    public int[] copy(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    //数组的排序
    public void sort(int[] arr, String desc) {
        if (desc == "asc") {//从小到大
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        } else if (desc == "desc") {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        } else {
            System.out.println("您输入的排序方式错误");
        }
    }

}
