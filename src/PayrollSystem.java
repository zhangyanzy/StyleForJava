import java.util.Scanner;

/**
 * Created by $zhanyan on 2017/12/4.
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new SalariedEmployee("李雷", 1001, new MyDate(1998, 12, 21), 8500);
        employees[1] = new HourlyEmployee("范冰冰", 1002, new MyDate(1997, 4, 30), 100, 6);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入本月的月份");
        int month = scanner.nextInt();
        for (int i = 0; i < employees.length; i++) {
            if (month == employees[i].getBirthday().getMonth()) {
                System.out.println("加工资");
            }
            System.out.println(employees[i]);
        }
    }
}
