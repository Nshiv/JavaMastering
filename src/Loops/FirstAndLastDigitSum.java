package Loops;

import java.util.Scanner;

public class FirstAndLastDigitSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your NUmber");
        int input = sc.nextInt();
        System.out.println(sumOfFirstandLast(input));
    }
    public static int sumOfFirstandLast(int num)
    {
        if(num<0)
        {
        return -1;
        }
        int lastDigit = num%10;
        while (num>=10)
        {
            num=num/10;
        }return lastDigit+num;

    }
}
