package bank;

/**
 * Created by $zhanyan on 2017/10/30.
 * 账户
 */
public class Account1 {
    //账户余额
    private double balance;

    public Account1(double init_balance) {
        balance = init_balance;

    }

    public double getBalance() {
        return balance;
    }

    //存钱
    public boolean deposit(double amt) {   //amt 额度
        balance = balance + amt;
        return true;
    }


    //取钱
    public boolean withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            return true;
        } else {
            System.out.println("账户余额不足");
            return false;
        }

    }
}
