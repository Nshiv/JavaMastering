package composition;

public class VehicleMain
{
    public static void main(String[] args)
    {
      Car cr = new Car(10, 10);
      double carconsuption = cr.getFuelEffiency(400);
        System.out.println(carconsuption);
        System.out.println("Total seats are "+cr.seats);

        Bike bk = new Bike(2,40);
        double bikeconsuption = bk.getFuelEfficiency(400);
        System.out.println(bikeconsuption);
        System.out.println("Total side seats are "+bk.sideSeat);
    }
}
