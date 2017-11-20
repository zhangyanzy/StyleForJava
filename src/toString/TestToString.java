package toString;

import object_oriented.superDemo.Person;

/**
 * Created by $zhanyan on 2017/11/8.
 *
 */

/**
 * java.lang.Object类的toString()方法如下定义：
 * getClass().getName() + "@" + Integer.toHexString(hashCode());
 * 1、当我们打印一个对象的引用时，实际上默认的toString方法
 * 2、当我们打印的对象所在的类中没哟重 写Objectd中的toString()方法时 就是调用Object中的toString（）方法  返回堆空间中的地址值h
 */
public class TestToString {
    public static void main(String[] args){
        Person p1 = new Person("aa",10);
        System.out.println(p1.toString());
        System.out.println(p1);
    }

}

