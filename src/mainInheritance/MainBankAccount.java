package mainInheritance;

import inheritance.BankAccount;

public class MainBankAccount
{
    public static void main(String[] args)
    {
        BankAccount ba = new BankAccount();
        ba.depositFunds(2000);
        System.out.println(ba.getAccount_balance());
        ba.withdrawFunds(100);
        System.out.println(ba.getAccount_balance());

    }
}
