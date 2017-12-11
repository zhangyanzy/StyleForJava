package list.collection.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 * Created by $zhanyan on 2017/12/7.
 */
public class HashSetDemo {
    /**
     * Set中常用的方法都是Collection下定义的
     * 1、无序性： 无序性！= 随机性  真正的无序性是元素在底层存储的位置是无序的
     * 2、不可重复的:当向Set中添加相同元素的时候  后面的元素是不可被添加进去的
     * <p>
     * 说明：要求添加进Set中的元素所在类  一定要重写equals方法和HashCode方法
     * 进而保证Set中的元素不可重复性
     * <p>
     * Set中的元素如何存储呢 ？使用哈希算法
     * 当向Set中添加对象时，首先调用此类的hashCode方法  计算此对象的哈希值，此哈希值决定了此对象在Set中的存储位置、
     * 若此位置之前没有对象存储  则这个对象直接存到这个位置
     * 若此位置之前有对象存储，在通过equals方法比较是否相同 如果相同 后一个对象就不能在添加进来
     */
    @Test
    public void method() {
        Set set = new HashSet();
        set.add(123);
        set.add(456);
        set.add("BB");
        set.add("AA");
        set.add(null);
        Person p1 = new Person("GG", 23);
        Person p2 = new Person("MM", 21);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        set.add(p1);
        set.add(p2);
        System.out.println(p1.equals(p2));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(set.size());

    }


}
