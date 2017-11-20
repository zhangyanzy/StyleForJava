package object_oriented.superDemo;

/**
 * Created by $zhanyan on 2017/11/7.
 */
public class Accout {
    protected int id;//账号
    protected double balance;//余额
    protected double annualinterestrate;//年利率

    public Accout(int id, double balance, double annualinterestrate) {
        this.id = id;
        this.balance = balance;
        this.annualinterestrate = annualinterestrate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualinterestrate() {
        return annualinterestrate;
    }

    public void setAnnualinterestrate(double annualinterestrate) {
        this.annualinterestrate = annualinterestrate;
    }

    //返回月利率
    public double getMonthlyInterest() {
        return annualinterestrate / 12;
    }

    //存款
    public void deposit(double amount) {
        balance = balance + amount;
    }

    //取 款
    public void withDraw(double amount) {
        if (this.balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("余额不足");
        }
    }

}

class CheckAccount extends Accout {

    private double overDraft;

    public CheckAccount(int id, double balance, double annualinterestrate, double overDraft) {
        super(id, balance, annualinterestrate);
        this.overDraft = overDraft;
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    public void withDraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else if (overDraft >= amount - balance) {
            overDraft = overDraft - (amount - balance);
            balance = 0;
        } else {
            System.out.println("超出额度");
        }
    }
}

class TestAccount {
    public static void main(String[] args) {
//        Accout accout = new Accout(1122, 20000, 0.045);
//        accout.withDraw(30000);
//        System.out.println("当前余额为： " + accout.getBalance());
//        accout.withDraw(2500);
//        accout.deposit(3000);
//        System.out.println("当年账户余额为：" + accout.getBalance());
//        System.out.println("月利率为: " + accout.getMonthlyInterest());

        CheckAccount ca = new CheckAccount(1122, 20000, 0.045, 5000);
        ca.withDraw(5000);
        System.out.println("当前余额为: " + ca.getBalance());
        System.out.println("当前可透支额度为： " + ca.getOverDraft());

    }
}
