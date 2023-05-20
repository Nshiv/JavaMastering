import java.util.Scanner;

public class PositiveNegativeZero
{
    public static void  main (String[] args)
    {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        double num = sc.nextDouble();
        numberIdentifier(num);
    }

    public static void numberIdentifier(double num)
    {
        if(num>0)
        {
            System.out.println("its a positive");
        } else if (num<0)
        {
            System.out.println("Its a negative");

        }else
        {
            System.out.println("its a zero");
        }

    }

}