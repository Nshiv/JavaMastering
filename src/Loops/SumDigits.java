package Loops;

import java.util.Scanner;

public class SumDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int input = sc.nextInt();
        System.out.println(sumDigits(input));
    }
    public static int sumDigits(int num)
    {
        if(num<0)
        {
            return -1;
        }
        int sum =0;
        while(num>9)
        {
            sum = sum+(num%10);
            num= num/10;
        }
        sum= sum+num;
        return sum;
    }
}
