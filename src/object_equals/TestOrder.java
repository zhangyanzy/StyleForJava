package object_equals;

/**
 * Created by $zhanyan on 2017/11/8.
 */

/**
 * == ：
 * 1、基本数据类型 (两段数据类型可以不同)  根据基本数据类型的值判断是否相等  相等返回true  泛指返回false
 * 2、引用数据类型  比较地址值
 * <p>
 * equals:-->java.lang.Object类  是所有类的父类
 * 1.只能处理引用类型变量的比较
 * 2.在Object类中发现equals仍然比较两个引用变量的值是否相等
 */
public class TestOrder {
    public static void main(String[] args) {
        order order1 = new order(1001, "AA");
        order order2 = new order(1001, "AA");
        System.out.println(order1 == order2);//false   地址值的比较
        System.out.println(order1.equals(order2));//false  地址值的比较  equals的源码还是this == obj

    }
}

class order {
    private int orderId;
    private String orderName;

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

//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        } else if (obj instanceof order) {
//            order o1 = (order) obj;
//            return this.orderId == o1.orderId && this.orderName.equals(o1.orderName);
//        } else {
//            return false;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        order order = (order) o;

        if (orderId != order.orderId) return false;
        return orderName != null ? orderName.equals(order.orderName) : order.orderName == null;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + (orderName != null ? orderName.hashCode() : 0);
        return result;
    }
}

