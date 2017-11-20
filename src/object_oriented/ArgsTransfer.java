package object_oriented;

/**
 * Created by $zhanyan on 2017/10/25.
 * 方法的参数传递
 * 1、形参 = 方法声明中 方法小括号内的参数
 * 实参 = 调用方法时，实际传入参数的值
 * 2、规则：
 * java的传递机制：值传递机制
 * 形参是基本数据类型的：将实参的值传递给形参的基本数据类型的变量
 * 形参是引用数据类型：
 */
public class ArgsTransfer {
    public static void main(String[] args) {
        ArgsTransfer tt = new ArgsTransfer();
        int i = 10;
        int j = 5;
        System.out.println("i = " + i + "," + "j = " + j);
        //交换变量i与j的值
//        int temp = i;//10
//        i = j;//5
//        j = temp;//10
//        System.out.println("i = " + i + "," + "j = " + j);

        tt.swap(i,j);
        System.out.println("i = " + i + "," + "j = " + j);

    }

    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }
}
