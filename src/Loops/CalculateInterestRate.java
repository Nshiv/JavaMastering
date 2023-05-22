package Loops;

public class CalculateInterestRate
{
    public static void main(String[] args)
    {
        for(double rate =5.0 ; rate<=9.0; rate=rate+0.25)
        {
            System.out.println(calcilateInterest(1000, rate));
        }
    }

    public static double calcilateInterest(double amount, double rate)
    {
        return  (amount* (rate/100));
    }

}
