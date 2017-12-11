package list.map;

import list.collection.set.Person;
import org.junit.Test;
import org.omg.CORBA.MARSHAL;

import javax.jws.Oneway;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * Created by $zhanyan on 2017/12/11.
 * Map接口：
 * 1、HashMap:,Map的主要实现类
 * Key是Set用来存放的  不可重复的  value是用Collection的存放的 可重复
 * 一个key-value是一个Entry  所有Entry是用Set来存放的 也是不可重复的
 * 2、LinkedHashMap:使用链表维护添加进Map中的顺序,所以遍历Map时，是按照添加进的顺序遍历
 * 3、TreeMap: 按照添加进Map中的元素的指定属性进行排序
 * 4、HashTable
 * ①：Properties:
 */
public class TestMap {
    @Test
    public void TestHashMap() {
        HashMap map = new HashMap();
        //1、添加一个对象
        map.put("AA", 123);
        map.put("BB", 456);
        map.put(987, "CC");
        map.put(null, null);
        map.put(new Person("DD", 23), 89);
        map.put(new Person("DD", 23), 87);

        //2、返回集合的长度
        System.out.println(map.size());
        System.out.println(map);
        //按照指定的key去删除
        map.remove("BB");
        System.out.println(map);
        //获取指定key的value值
        System.out.println(map.get("AA"));
    }

    @Test
    public void TestHashMap1() {
        HashMap map = new HashMap();
        map.put("AA", 123);
        map.put("BB", 456);
        map.put(987, "CC");
        map.put(null, null);
        map.put(new Person("DD", 23), 89);
        //1.遍历key集合
        System.out.println("-----------------遍历Key-------------------------");
        Set set = map.keySet();
        for (Object obj : set) {
            System.out.println(obj);
        }
        System.out.println("-----------------遍历value----------------");
        //2、遍历Value集
        Collection values = map.values();
        Iterator iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----------------遍历Key-value（方式一）----------------------------------");
        //3、遍历key-value对
        Set set1 = map.keySet();
        for (Object obj : set1) {
            System.out.println(obj + "------------>" + map.get(obj));
        }
        System.out.println("-----------------遍历Key-value(方式二)----------------------------------");
        Set set2 = map.entrySet();
        for (Object obj : set2) {
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "=" + entry.getValue());

        }
    }

    @Test
    public void TestLinkedHashMap() {
        LinkedHashMap map = new LinkedHashMap();
        map.put("AA", 123);
        map.put("BB", 456);
        map.put(987, "CC");
        map.put(null, null);
        map.put(new Person("DD", 23), 89);
    }

    @Test
    public void TestTreeMap() {
        Map map = new TreeMap();
        map.put(new Person("AA", 23), 89);
        map.put(new Person("MM", 22), 79);
        map.put(new Person("GG", 33), 99);
        map.put(new Person("JJ", 13), 69);

        Set set = map.keySet();
        for (Object object : set) {
            System.out.println(object + "=" + map.get(object));
        }
    }

    @Test
    /**
     * HashTable是个古老的实现类，线程安全
     * HashTable不允许使用null作为Key和value
     * 也不能保证key-value的对的顺序
     * 判断相等的两个Key相等  都要重写equals方法和HashCode值
     */
    public void TestHashTable() {
        /**
         * 主要实现子类：Properties:常用来处理属性文件 key和value都为String
         */
        Properties pro = new Properties();
        try {
            pro.load(new FileInputStream(new File("JDBC.properties")));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("找不到该文件");
        }
        String user = pro.getProperty("user");
        System.out.println(user);
    }

}