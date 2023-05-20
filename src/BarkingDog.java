import java.util.Scanner;

public class BarkingDog
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me me in true or false : is dog barking");
        boolean is_barking = sc.nextBoolean();
        System.out.println("Tell me the time please");
        double time = sc.nextDouble();
        System.out.println(shouldWakeUp(is_barking,time));

    }

    public static boolean shouldWakeUp(boolean barking, double time)
    {
       if(barking)
       {
           if(time<0 || time>23)
           {
               return false;
           } else if (time>0 || time>22)
           {
               return  true;
           }
           else
           {
               return  false;
           }
       }
       else {
           return false;
       }
    }
}
