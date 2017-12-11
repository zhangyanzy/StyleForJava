package list.collection.set;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by $zhanyan on 2017/12/11.
 */
public class TestTreeSet {
    @Test
    public void method() {
        TreeSet set = new TreeSet();
        Employee e1 = new Employee("ZHANG", 55, new MyDate(15, 03, 1994));
        Employee e2 = new Employee("QIAN", 43, new MyDate(7, 12, 1965));
        Employee e3 = new Employee("SUN", 33, new MyDate(12, 2, 1994));
        Employee e4 = new Employee("LI", 54, new MyDate(15, 01, 1967));
        Employee e5 = new Employee("ZHOU", 65, new MyDate(15, 03, 1945));
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //定制排序
    @Test
    public void method2() {
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee1 && o2 instanceof Employee1) {
                    Employee1 e1 = (Employee1) o1;
                    Employee1 e2 = (Employee1) o2;
                    MyDate birth1 = e1.getBirthday();
                    MyDate birth2 = e2.getBirthday();
                    if (birth1.getYear() != birth2.getYear()) {
                        return birth1.getYear() - birth2.getYear();
                    } else {
                        if (birth1.getMonth() != birth2.getMonth()) {
                            return birth1.getMonth() - birth2.getMonth();
                        } else {
                            return birth1.getDay() - birth2.getDay();
                        }
                    }
                }
                return 0;
            }
        };
        TreeSet set = new TreeSet(com);
        Employee1 e1 = new Employee1("ZHANG", 55, new MyDate(15, 03, 1994));
        Employee1 e2 = new Employee1("QIAN", 43, new MyDate(7, 12, 1965));
        Employee1 e3 = new Employee1("SUN", 33, new MyDate(12, 2, 1994));
        Employee1 e4 = new Employee1("LI", 54, new MyDate(15, 01, 1967));
        Employee1 e5 = new Employee1("ZHOU", 65, new MyDate(15, 03, 1945));
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
