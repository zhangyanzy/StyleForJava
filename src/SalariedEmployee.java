/**
 * Created by $zhanyan on 2017/12/4.
 */
public class SalariedEmployee extends Employee {

    private double mothlySalary;//月工资



    public SalariedEmployee(String name,int number,MyDate birthday,double mothlySalary) {
        super(name,number,birthday);
        this.mothlySalary = mothlySalary;
    }

    @Override
    public double earnings() {
        return mothlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + super.toString() +
                "mothlySalary=" + mothlySalary +
                '}';
    }
}
