package Loops;

import java.util.Scanner;

public class PrimeNumberInRange
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit");
        int lower = sc.nextInt();
        System.out.println("enter upper limit");
        int upper = sc.nextInt();
        for(int num =lower;num<upper;num++)
        {
            if(isPrime(num))
            {
                System.out.println(num);
            }
        }

    }

    public static boolean isPrime(int number)
    {
        if(number<=1)
        {
            return false;
        }
        for(int i=2;i<number;i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;
    }

}
