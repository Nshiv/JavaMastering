import java.util.Scanner;

public class TeenIdentifier
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println(isTeen(a));
        System.out.println("enter third number");
        int c = sc.nextInt();
        //System.out.println(hasTeen(a,b,c));

    }
    public static boolean isTeen(int a )
    {
        if(a<=0 || a<12)
        {
            return false;
        } else if (a>=13 && a<=19)
        {
         return true;
        }
        else
        {
            return false;
        }
    }

   /* public static boolean hasTeen(int a , int b , int c)
    {
        if((a>=13 && a<=19) || (b<=13 && b>=19) ||(c<=13 && c>=19))
        {
            return true;
        }else
        {
            return false;
        }

    }*/
}
