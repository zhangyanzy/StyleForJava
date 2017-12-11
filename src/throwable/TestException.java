package throwable;


/**
 * Created by $zhanyan on 2017/12/5.
 */

import org.junit.Test;

import java.util.Date;

/**
 * Java.lang.Throwable
 * Error:错误 在程序中不进行处理
 * Exception：异常 要求在编写程序时，就要考虑到对异常的处理
 * 编译时异常：在编译期间会出现的异常 执行javac命令时  出现异常
 * 运行时异常：在运行期间会出现的异常
 * <p>
 * <p>
 * 当执行一个程序时，如果出现异常 异常之后的代码就不会在被执行
 */
public class TestException {
    /**
     * ArrayIndexOutOfBoundsException
     * 数组下标越界的异常（左右两边都可以越界）
     */
    @Test
    public void test1() {
        int[] i = new int[10];
        System.out.println(i[10]);
    }

    /**
     * 算术异常
     * AruthmeticExceotion
     */
    @Test
    public void test2() {
        int i = 10;
        System.out.println(i / 0);
    }

    /**
     * 类型转换异常
     */
    @Test
    public void test3() {
        Object obj = new Date();
        String str = (String) obj;
    }

    /**
     * 空指针异常
     */
    @Test
    public void test4() {
//        Person p = new Person();
//        p = null;
//       System.out.println(p.toString());

        String str = "AAA";
//        str = null;
        System.out.println(str.length());
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
















