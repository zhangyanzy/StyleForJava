package throwable;

import org.junit.Test;

import java.util.Date;

/**
 * Created by $zhanyan on 2017/12/5.
 * <p>
 * 如何处理Exception
 * java提供的是异常处理的抓抛模型
 *          1.“抛”：当我们执行代码时，一旦出现异常，就会在异常的代码处生成一个对应的异常类型对象，并将此对象抛出
 * 一旦抛出异常类的对象，那么程序就终止执行 下面的代码就不会执行
 * 此异常类的对象抛给方法的调用者
 * <p>
 *          2、“抓”抓住上一步抛出来的异常类的对象。如何抓？就是异常处理的方式
 * java 提供了两种方式来处理异常类的对象
 * 处理的方式：
 *       1）：try{
 * //可能出现异常的代码
 * }carch(Exception1 e1){
 * //如果异常为Exception1    的处理的方式
 * }carch(Exception2 e2){
 * //如果异常为Exception2    的处理的方式
 * }finally{
 * //一定要执行的代码
 * }
 * 注意：1、try内声明的变量 类型与局部变量  出了try的语句   就不能被调用
 * 2、finally是可选的
 * 3、catch语句内部是对异常对象的处理
 * e.getMessage()    e.printStackTrace();
 * 4、可以有多个catch语句  try中抛出的异常类对象从上往下去匹配catch中的异常类型  一旦满足catch中的语句
 * 执行完之后 就跳出其后的多条catch语句
 *  5、如果异常处理了  那么其后的代码继续执行
 *  6、若catch中就多个异常类型是并列关系，谁上谁下都可以
 *  7、finally中存放的是一定会被执行的代码  不管有没有异常仍未被处理  以及是否有return语句
 *
 *
 */
public class ExceptionDemo {

    /**
     * ArrayIndexOutOfBoundsException
     * 数组下标越界的异常（左右两边都可以越界）
     */
    @Test
    public void test1() {
        try {
            int[] i = new int[10];
            System.out.println(i[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("出现数组越界的异常");
            System.out.println(e.getMessage());
        }
        System.out.println("hello");
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
        Person p = new Person();
        p = null;
        System.out.println(p.toString());

//        String str = "AAA";
//        str = null;
//        System.out.println(str.length());
    }

}
