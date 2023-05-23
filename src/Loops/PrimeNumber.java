package Loops;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        isPrime(0);
        isPrime(1);
        isPrime(2);
        isPrime(3);
        isPrime(15);
        isPrime(31);
        isPrime(100);
        isPrime(11111);
    }
    public static void isPrime(int num)
    {
        int count =0;

        for(int i =1; i<num;i++)
        {
            if(num%i==0)
            {
                count++;

            }

        }
        if(count==1)
        {
            System.out.println("Its a prime");
        }
        else
        {
            System.out.println("not a prime");
        }

    }
}
