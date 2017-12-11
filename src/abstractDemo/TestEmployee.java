package abstractDemo;

/**
 * Created by $zhanyan on 2017/11/22.
 */

class CommonEmployee extends Employee {

    @Override
    public void work() {
        System.out.println("在流水线工作");
    }
}

class Manger extends Employee {

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("监督管理");
    }

}

abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public abstract void work();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class TestEmployee {
    public static void main(String[] args){
        Employee e = new Manger();
        e.work();
        Employee e1 = new CommonEmployee();
        e1.work();
    }

}
