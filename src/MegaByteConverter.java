import java.util.Scanner;

public class MegaByteConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values to convert ");
        int value = sc.nextInt();
        byteConverter(value);
    }

    public static void byteConverter(int num)
    {

       if(num<0)
       {
           System.out.println("Invalid inputs");
       }

       else
           {
               int mb = num / 1024;
               int kb = num % 1024;
               System.out.println(mb + "MB" + " " + kb + "KB");

           }
       }

    }


