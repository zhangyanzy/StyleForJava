package list.collection.set;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by $zhanyan on 2017/12/7.
 * <p>
 * 1、像treeSet中添加的元素必须是同一个类的
 * 2、元素不可重复的，按照从小到大 指定的顺序去遍历
 * 3、当向TreeSet中添加自定义类的对象时有两种排序方法：
 * ①自然排序：要求自定义类实现Java.lang.Comparable接口并重写其CompareTo抽象方法
 * 在此方法中，指明按照哪个类的哪个属性进行排序
 * ②定制排序：
 * 4、像TreeSet添加元素时，首先按照compareTo方法进行比较，一旦返回0，虽然仅是两个对象的此属性值相同，但程序会认为这两个属性是相同  然后后一个对象就不能添加进来
 */
public class TreeSetDemo {
    @Test
    public void method() {
        Set set = new TreeSet();
//        set.add("AA");
//        set.add("AA");
//        set.add("JJ");
//        set.add("GG");
//        set.add("MM");
        //当Person类没有实现Comparable接口时，当向treeSet中添加Person对象时，报ClassCastException
        set.add(new Person("AA", 23));
        set.add(new Person("MM", 21));
        set.add(new Person("GG", 25));
        set.add(new Person("JJ", 24));
        set.add(new Person("DD", 20));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * 定制排序:
     * 1、创建一个实现了Comparater接口的类的对象
     * 2、
     */
    @Test
    public void method2() {
//        Comparator com = new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                if (o1 instanceof Customer && o2 instanceof Customer){
//                    Customer c1 = (Customer) o1;
//                    Customer c2 = (Customer) o2;
//                }
//                return 0;
//            }
//        }

        //2,将此对象作为形参传递给TreeSet的构造器中
        TreeSet set = new TreeSet();
        set.add(new Customer("AA", 1003));
    }
}
