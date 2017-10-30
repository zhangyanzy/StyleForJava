package bank.test;

import bank.Account;
import bank.Customer;
  
/**
 * Created by $zhanyan on 2017/10/30.
 */
public class TestCustomer {
    public static void main(String[] args) {
        Account account = new Account(500);
        Customer Jane = new Customer("jane", "Smith");
        Jane.setAccount(account);
        Jane.getAccount().withdraw(150);
        Jane.getAccount().deposit(22.5);
        Jane.getAccount().withdraw(47.62);

        System.out.println("Customer" + ": " + Jane.getFirstName() + " , has a balance of " + Jane.getAccount().getBalance());

    }
}
