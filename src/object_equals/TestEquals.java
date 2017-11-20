package object_equals;

/**
 * Created by $zhanyan on 2017/11/9.
 *
 */
public class TestEquals {
    public static void main(String[] args) {
        /**
         * 使用构造方法Cat()在堆内存中New出两只猫
         * 这个两只猫的color weight height都是一样的
         * 但c1和c2永远都不会相等  因为c1和c2是堆内存中两只猫的引用对象
         * 装着是不同的两只猫的地址值  两只猫在堆内存中存储在两个不同的空间里
         * 所有c1和c2分别装着不同的地址  所有c1和c2是永远不会相等的
         * */
        Cat c1 = new Cat(1, 1, 1);
        Cat c2 = new Cat(1, 1, 1);
        System.out.println(c1 == c2);//false
        /**
         * 重写过equals方法之后改变了这个方法的默认实现
         * 我们把方法的实现改为只要这个两个对象是是真实存在的
         * 并且都是猫   color,  weight,  height
         * 属性且都是相同的存在的
         * 那么这两只猫在逻辑上都是一样的  完全相等的两只猫是相等的
         */
        System.out.println(c1.equals(c2));//false-->true
        /**
         * 比较字符串的值是否相等？？
         */
        String s1 = new String("hello");
        String s2 = new String("hello");


    }
}

class Cat {
    private int color;
    private int weight;
    private int height;

    public Cat(int color, int weight, int height) {
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj instanceof Cat) {
            /**
             * instanceof是对象运算符
             * 对象运算符是用来测定一个对象是否属于某个指定类或者指定子类的实例
             * 该运算符是一个双目运算符    左边的表达式是一个对象，右边的表达式是一个类
             * 如果左边的对象是右边类创建的对象  运算结果为true 否则为false
             */
            Cat cat = (Cat) obj;
            if (cat.color == this.color && cat.weight == this.weight && cat.height == this.height) {
                return true;
            }
        }
        return false;
    }
}
