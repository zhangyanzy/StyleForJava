package bank.test;

import bank.Account1;
import bank.Bank;
import bank.Customer;

/**
 * Created by $zhanyan on 2017/10/30.
 */
public class TestBanking {

    public static void main(String[] args) {
        //账户余额为500
        Account1 account = new Account1(500);
        //取钱
        account.withdraw(150);
        //存钱
        account.deposit(22.5);
        //取
        account.withdraw(47.62);

        System.out.println(account.getBalance());
        System.out.println("----------------------------------------------");

        Bank bank = new Bank();
        bank.addCustomer("zhang", "yan");
        bank.addCustomer("ye", "qing");
        bank.addCustomer("zhang", "xin");
        bank.addCustomer("android", "phone");
        bank.addCustomer("IOS", "phone");


        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
            Customer customer = bank.getCustomer(i);
            System.out.println(customer.getFirstName() + "," + customer.getLastName());
        }

    }
}
