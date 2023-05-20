import java.util.Scanner;

public class KmToMilesConverter
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number in KM");

    double num = sc.nextDouble();
    speedInMiles(num);
  }
  public static void speedInMiles(double speed)
  {
      if(speed<0)
      {
        System.out.println("Invalid inputs");
      }else
      {
        double milePerHours = Math.round(speed/1.6);
          System.out.println(milePerHours+" miles/hr");
      }

  }
}
