import java.util.Scanner;

public class SumValidator
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        System.out.println(validateSum(a,b,c));

    }

    public static boolean validateSum(int a , int b , int c )
    {
        int sum = a + b;
        if (sum == c) {
            return true;
        } else {
            return false;
        }
    }
}



