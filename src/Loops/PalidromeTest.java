package Loops;

import java.util.Scanner;

public class PalidromeTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input to check palindrom");
        int input= sc.nextInt();
        System.out.println(isPalindrome(input));
    }
    public static boolean isPalindrome(int num)
    {
        int actual_num =num;
        int reverse =0;
        while(actual_num!=0)
        {
           int last_digit = actual_num%10;
           reverse= (reverse*10)+last_digit;
           actual_num= actual_num/10;
        }
        return num==reverse;
   }
}
