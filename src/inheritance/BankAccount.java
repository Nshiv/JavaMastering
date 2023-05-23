package inheritance;

public class BankAccount {
    private String account_number;
    private double account_balance;
    private String cust_name;
    private String email;
    private String phone;

    public void depositFunds(double depositeAmount)
    {
     account_balance +=depositeAmount;
        System.out.println("Deposited amount is "+depositeAmount + " new balance is " +account_balance);
    }

    public void withdrawFunds(double withdrawAmount)
    {
        if(account_balance-withdrawAmount<0)
        {
            System.out.println("Insufficient funds. you only have "+account_balance+ " in your account");
        }
        else {
            account_balance -= withdrawAmount;
            System.out.println("Withdaw amount is " + withdrawAmount + " new balance is " + account_balance);
        }

    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(long account_number) {
        this.account_number = String.valueOf(account_number);
    }

    public double getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(long account_balance) {
        this.account_balance = account_balance;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
