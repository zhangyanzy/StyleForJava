package Array;

/**
 * Created by $zhanyan on 2017/10/11.
 */
public class Array {
    public static void main(String[] args) {
        start();
        length();
    }

    private static void length() {
        int[] arr = {11, 12, 13};
        int[] arrs = new int[10];
        //将arr中的数据赋值到arrs中
        for (int i = 0; i < arr.length; i++) {
            arrs[i] = arr[i];
        }
        for (int j = 0; j < arrs.length; j++) {
            System.out.println("重新开数组赋值的结果为：" + arrs[j]);
        }
    }

    private static void start() {
        /**
         *   1、声明&&初始化
         */
        //1、静态初始化&&数组元素赋值同时进行
        String[] name = new String[]{"aa", "bb", "cc"};
        //2、动态初始化与赋值分开进行
        String[] arr = new String[4];

        /**
         *  1.2、动态初始化,赋值，调用相对应的数组元素（通过下标）
         */
        arr[0] = "";
        arr[1] = "";
        /**
         * 2、数组的长度，通过数组的length的属性。
         */
        System.out.println("name数组的长度为： " + name.length);

        /**
         *  3、如何遍历数组中的所有元素
         */
        boolean[] booleans = new boolean[4];
        for (int i = 0; i < booleans.length; i++) {
            System.out.println("boolean的数组遍历: " + booleans[i]);
        }
        System.out.println(booleans);
        /**
         *  4、关于数组在内存中的结构
         */
    }

}

