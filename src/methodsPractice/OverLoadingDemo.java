package methodsPractice;

import java.util.Scanner;

public class OverLoadingDemo
{
    public static void main(String[] args)
    {
        System.out.println(convertToCM(18));
        System.out.println(convertToCM(5,11));
    }
    public static double convertToCM(int inches)
    {
      return inches*2.54;

    }

    public static double convertToCM(int foot, int inches )
    {
        return  convertToCM((foot*12)+inches);

    }


}
