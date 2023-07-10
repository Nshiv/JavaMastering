package java100InterviewQuestions;

import java.util.Scanner;

public class PrimeInRange
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Max number");
        int num = sc.nextInt();
        for(int i=2;i<=num;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i+" ");
            }
        }

    }
    public static boolean isPrime(int number)
    {
        if(number<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(number);i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;

    }
}
