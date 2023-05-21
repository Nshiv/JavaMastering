package methodsPractice;

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();
        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(int year)
    {
       if(year<=0)
       {
           return  false;
       } else if (year%4==0 || year%100==0 || year%400==0)
       {
          return  true;
       }
       else
       {
           return false;
       }
    }
}
