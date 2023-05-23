package mainInheritance;

import inheritance.BankAccount;

public class MainBankAccount
{
    public static void main(String[] args)
    {
        BankAccount ba = new BankAccount("221122",200, "lorem","test@test.com","83683465");
        System.out.println(ba.getAccount_number());
        System.out.println(ba.getCust_name());
        System.out.println(ba.getEmail());
        System.out.println(ba.getPhone());
        System.out.println(ba.getAccount_balance());
        ba.depositFunds(2000);
        System.out.println(ba.getAccount_balance());
        ba.withdrawFunds(100);
        System.out.println(ba.getAccount_balance());

    }
}
