package bank;

/**
 * Created by $zhanyan on 2017/10/31.
 * 银行
 */
public class Bank {

    //存放客户
    private Customer[] customers;
    //记录客户的个数
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[5];
    }

    public void addCustomer(String f, String l) {
        Customer customer = new Customer(f, l);
        customers[numberOfCustomers] = customer;
        numberOfCustomers++;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }

}
