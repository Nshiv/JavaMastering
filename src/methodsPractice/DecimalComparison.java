package methodsPractice;

import java.util.Scanner;

public class DecimalComparison
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first decimal number");
        double num1 = sc.nextDouble();
        System.out.println("Enter seconf decimal number");
        double num2 = sc.nextDouble();
        System.out.println(is_Equal(num1,num2));
    }
    public static boolean is_Equal(double a , double b )
    {
      a = a*1000;
      b = b*1000;
      if(a==b)
      {
          return true;
      }
      else
      {
          return false;
      }
    }
}
