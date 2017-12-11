package singleton;

import bank.Customer;

/**
 * Created by $zhanyan on 2017/11/20.
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    private Bank() {
        customers = new Customer[5];
    }
    private static Bank bank = new Bank();

    public static Bank getBanking(){
        return bank;
    }

}
