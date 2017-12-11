package list.collection.list;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 * Created by $zhanyan on 2017/12/6.
 */
public class ContentionDemo {

    public static void main(String[] args) {
        method3();
    }

    private static void method1() {
        //1、size();
        Collection col = new ArrayList<>();
        System.out.println(col.size());
        //2、add(Object obj)
        col.add(123);
        col.add("AA");
        col.add(new Date());
        System.out.println(col.size());
        //3、addAll(Collection coll)
        Collection c = new ArrayList();
        c.add("new ");
        col.addAll(c);
        System.out.println(col.size());
        //4、判断集合是否为空
        if (col.isEmpty()) {
            System.out.println("空");
        } else {
            System.out.println("不为空");
        }
        //5、查看元素的遍历
        System.out.println(col);
        //6、清空元素
        col.clear();
        System.out.println(col.size());
    }

    private static void method2() {
        // 6 contains
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add("AA");
        coll.add(new Date());
        System.out.println(coll.contains(123));
        // 7、ContainsAll
        Collection c = new ArrayList();
        c.add("BB");
        c.add(123);
        c.add(123);
        c.add("AA");
        c.add(new Date());
        //是否全部包含
        boolean b = c.containsAll(coll);
        System.out.println("是否全部包含" + b);
        //8 retainAll  求当前集合和形参部分集合的交集  返回给当前集合
        coll.retainAll(c);
        System.out.println(coll);
        //9 remove
        boolean bb = coll.remove("AA");
        System.out.println(bb);
        System.out.println(coll);

    }

    private static void method3() {
        Collection col1 = new ArrayList();
        col1.add(123);
        col1.add("AA");

        col1.add(new Date());
        col1.add("BB");
        System.out.println(col1);

        Collection col2 = new ArrayList();
        col2.add(123);
        col2.add("AA");
        System.out.println(col2);
        // removeAll
        col1.removeAll(col2);
        System.out.println(col1);


        //equals 判断两个集合是否相等
        System.out.println(col1.equals(col2));
        //HashCode  算HashCode
        System.out.println(col1.hashCode());
        //toArray
        Object[] array = col1.toArray();
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //14、iterator  返回一个iterator的接口实现类
        Iterator iterator = col1.iterator();
        //实现遍历
        for (int i = 0; i < col1.size(); i++) {
            System.out.println(iterator.next());
        }

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
