package Loops;

import java.util.Scanner;

public class SharedDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number between 10 to 99");
        int first = sc.nextInt();
        System.out.println("Enter second number between 10 to 99");
        int second = sc.nextInt();
        System.out.println(getSharedDigit(first,second));
    }
    public static boolean getSharedDigit(int first, int second)
    {
       if(first>=10 && first<=99 && second>=10 && second<=99 || first/10 ==second/10 || first%10 ==second%10)
       {
           return true;
       }
       return false;

    }

}
