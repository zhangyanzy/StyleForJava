package bank;

/**
 * Created by $zhanyan on 2017/10/30.
 * 用户信息
 */
public class Customer {

    private String firstName;
    private String lastName;
    private Account1 account;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account1 getAccount() {
        return account;
    }

    public void setAccount(Account1 acct) {
        account = acct;
    }

}
