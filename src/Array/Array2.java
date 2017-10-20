package Array;

/**
 * Created by $zhanyan on 2017/10/12.
 */
public class Array2 {
    public static void main(String[] args) {
        int[][] age = new int[3][2];
        age[1][0] = 90;
        age[2][1] = 100;
//        二维数组的长度
        System.out.println("大数组的长度： " + age.length);//大数组中的长度
        System.out.println("大数组中小数组的长度： " + age[0].length);//大数组中第一个小数组中长度

        /**
         *  如何遍历二维数组
         */
        for (int i = 0; i < age.length; i++) {//控制行数
            for (int j = 0; j < age[i].length; j++) {
                System.out.print(age[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
