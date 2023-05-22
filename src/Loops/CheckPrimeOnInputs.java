package Loops;

import java.util.Scanner;

public class CheckPrimeOnInputs
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your number");
       int num = sc.nextInt();
        System.out.println(isPrime(num));
    }

    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i =2; i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
