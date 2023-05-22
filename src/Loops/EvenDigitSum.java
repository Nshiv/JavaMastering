package Loops;

import java.util.Scanner;

public class EvenDigitSum
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println(sumEvenDigits(num));
    }
    public static int sumEvenDigits(int num)
    {
      int sum =0;
      if(num<=0)
      {
          return -1;
      }
      while(num>0)
      {
          int digit = num%10;
          if(digit%2==0)
          {
              sum = sum+digit;
          }
          num=num/10;
      }return sum;
    }
}
