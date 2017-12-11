package noStatic;

/**
 * Created by $zhanyan on 2017/11/22.
 * 关于属性赋值操作：
 * 1.默认赋值
 * 2.显示初始化或者代码块的初始化（按照代码顺序）
 * 3.构造器
 * 4.通过方法对  对象的属性进行修改
 */
public class TestOrder {
    public static void main(String[] args) {
        order o1 = new order();
        System.out.println(o1);
        order o2 = new order();
        System.out.println(o2);
    }
}

class order {
    private int orderId;
    private String orderName;

    /**
     * 初始化代码块
     *
     * 静态代码块
     * 1、里面可以有输出语句
     * 2、随着类的加载而加载 而且只被加载一次
     * 3、多个静态代码块之间按照顺序执行
     * 4、静态代码块的执行要早于飞静态代码块的执行
     * 5、静态代码块中只可以调用静态的结构（类属性 类方法）
     *
     *
     *
     * 非静态代码块
     * 1、可以对类的属性（静态&&非静态）进行初始化操作
     * 2、可以有输出语句
     * 3、一个类中可以有多个非静态代码块，多个代码块之间按照顺序结构执行
     * 4、每创建一个类   静态代码块就创建一次
     * 5、非静态代码块的构造器 要早执行于构造器
     */
    //非静态代码块
    {
        orderId = 1002;
        orderName = "AA";
        System.out.println("我是非静态代码块");
    }

    //静态代码块
    static {
        System.out.println("我是静态代码块");
    }

    public order() {
        super();
        System.out.println("我是order类的空参构造器");
    }

    public order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public String toString() {
        return "order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
