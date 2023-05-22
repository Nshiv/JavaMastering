package Loops;

import java.util.Scanner;

public class SumOfOdd
{
    public static void main(String[] sk)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit");
        int lower = sc.nextInt();
        System.out.println("Enter upper limit");
        int upper = sc.nextInt();
        System.out.println(getSumOfOdd(lower,upper));

    }

    public static boolean isOdd(int num)
    {
       if(num%2!=0)
       {
           return true;
       }
       return false;
    }
    public static int getSumOfOdd(int a , int b)
    {
        int sum = 0;
        for(int number =a;number<=b;number++)
        {
            if(number<=0)
            {
                return -1;
            }
            if(isOdd(number))
            {
                sum=sum+number;
            }
        }
       return sum;
    }
}
