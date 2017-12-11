package list.collection.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by $zhanyan on 2017/12/6.
 * ArrayList的主要实现类  有序性 可以重复
 */

public class ArrayListDemo {
    @Test
    public void test1() {
        List list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add("BB");
        System.out.println(list);

        //void add(int index,Object ele) 在指定索引的位置加上ele元素
        list.add(0, 999);
        System.out.println(list);
        //获取指定位置的元素
        Object o = list.get(0);
        System.out.println(o);
        //删除指定位置的元素
        list.remove(1);
        System.out.println(list);
        //设置或者修改索引指定位置的元素
        list.set(2, "CC");
        System.out.println(list);

    }

    @Test
    public void test2() {
        List list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add("BB");
        list.add(456);
        //int indexOf(object obj)返回obj在集合中首次出现的位置，若没有 则返回-1
        //int lastIndexOf（）返回obj最后一次出现的位置，若没有 则返回-1
        System.out.println(list.indexOf(456));
        System.out.println(list.lastIndexOf(456));
        //List subList(int index,int toIndex) 返回从fromIndex到toIndex结束的一个子list
        List list1 = list.subList(0, 3);
        System.out.println(list1);

    }
}
