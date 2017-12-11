package list.collection.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 * Created by $zhanyan on 2017/12/6.
 * 集合遍历：
 */

public class TestIterator {

    @Test
    public void test1() {
        Collection co1 = new ArrayList();
        co1.add(123);
        co1.add(new String("AA"));
        co1.add(new Date());
        co1.add("BB");


        Iterator iterator = co1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------------");

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 10;
            System.out.println(arr[i]);
        }

    }

    @Test
    public void test2() {
        Collection co1 = new ArrayList();
        co1.add(123);
        co1.add(new String("AA"));
        co1.add(new Date());
        co1.add("BB");

        for (Object i : co1) {
            System.out.println(i);
        }

    }

    @Test
    public void test3() {
        String[] str = new String[]{"A", "S", "D", "F"};
        for (int i = 0; i < str.length; i++) {
            str[i] = i +"";
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }


}
