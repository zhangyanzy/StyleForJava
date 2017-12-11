package list.collections;

import org.junit.Test;

import java.util.*;

/**
 * Created by $zhanyan on 2017/12/11.
 * 操作数据的一个工具类
 * 可以操作Collection和Map
 */

public class CollectionsDemo {
    @Test
    public void TestCollection1() {
        List list = new ArrayList();
        list.add(123);
        list.add(321);
        list.add(12);
        list.add(78);
        System.out.println(list);
        //数组元素的反转
        Collections.reverse(list);
        System.out.println(list);
        //随机排列
        Collections.shuffle(list);
        System.out.println(list);
        //根据元素的自然顺序对指定的list集合按升序元素排序
        Collections.sort(list);
        System.out.println(list);//从小到大
        //交换list 两个元素的位置
        Collections.swap(list, 0, 2);
        System.out.println(list);

    }

    @Test
    public void TestCollection2() {
        List list = new ArrayList();
        list.add(123);
        list.add(321);
        list.add(12);
        list.add(78);
        System.out.println(list);
        //获取集合的最大值
        Comparable max = Collections.max(list);
        System.out.println(max);
        //获取list中某个元素出现的次数
        int frequency = Collections.frequency(list, 0);
        System.out.println(frequency);
        //把后者集合的元素都Copy到前者的集合中
        List newList = Arrays.asList(new Object[list.size()]);
        Collections.copy(newList, list);
        System.out.println(newList);
        //在一个list中把旧的值换成新的值
        Collections.replaceAll(list, 123, 321);
        System.out.println(list);

    }

    @Test
    public void TestCollections() {
        /**
         *  同步控制
         */
        List list = new ArrayList();
        list.add(123);
        list.add(321);
        list.add(12);
        list.add(78);
        //通过如下的方法保证list的线程安全性
        List list1 = Collections.synchronizedList(list);

    }


}
