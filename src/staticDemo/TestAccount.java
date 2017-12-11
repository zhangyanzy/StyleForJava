package staticDemo;

/**
 * Created by $zhanyan on 2017/11/20.
 */
public class TestAccount {
    public static void main(String[] args){
        Account a1  = new Account("123456",1000);
        Account a2 = new Account("654321",2000);
        Account a3 = new Account("1994",3000);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}

class Account {

    private int id;
    private String password;
    private double balance;//余额
    private static double rate = 0.05;//利率
    private static double minBalance = 1000;//最小余额

    private static int init = 1000;

    public Account(String password, double balance) {
        super();
        this.id = init++;
        this.password = password;
        this.balance = balance;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Account.rate = rate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
