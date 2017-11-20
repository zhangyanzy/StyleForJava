package bank.test;

import object_oriented.superDemo.Accout;

/**
 * Created by $zhanyan on 2017/11/8.
 */
public class Account {
    protected double balance;

    public Account() {
        super();
    }

    public Account(double balance) {
        super();
        this.balance = balance;
    }
}

/**
 * 储蓄账户
 */
class SavingAccount extends Account {
    //利率
    protected double interestRate;

    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }


}

/**
 * 信用卡账户
 */
class CheckingAccount extends Account {
    protected double overDraftProtection;//透支额度

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double interestRate, double overDraftProtection) {
        super(balance);
        this.overDraftProtection = overDraftProtection;

    }

    public boolean withDraw(double amt) {
        if (balance >= amt) {
            balance = balance - amt;
            return true;
        } else if (overDraftProtection >= balance - amt) {
            overDraftProtection = overDraftProtection - (amt - balance);
            balance = 0;
            return true;
        } else {
            return false;
        }
    }

}

