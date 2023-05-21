package methodsPractice;

import java.util.Scanner;

public class SpeedConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your inputs in KM/hr");
        double input = sc.nextDouble();
        double output = Math.round(kmToMiles(input));
        System.out.println(output+" m/hr");
    }

    public static double kmToMiles(double num)
    {
       double milesPerHr;
       milesPerHr = num/1.6;
       return milesPerHr;

    }
}
