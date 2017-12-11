/**
 * Created by $zhanyan on 2017/12/4.
 */
public class HourlyEmployee extends Employee {

    private double wage;
    private double hour;

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + super.toString() + "" +
                "wage=" + wage +
                ", hour=" + hour +
                '}';
    }
}
