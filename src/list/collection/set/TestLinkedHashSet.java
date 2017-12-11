package list.collection.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by $zhanyan on 2017/12/7.
 * LinkedHashSet:使用链表维护了一个添加进集合中的顺序，导致我们在遍历LinkedHashSet集合元素时
 * 是按照添加进去元素的顺序去遍历
 */
public class TestLinkedHashSet {
    @Test
    public void method() {
        Set set = new LinkedHashSet();
        set.add(123);
        set.add(456);
        set.add("AA");
        set.add("AA");
        set.add("BB");
        set.add(null);

        Iterator iterator = set.iterator();
        System.out.println("遍历");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
