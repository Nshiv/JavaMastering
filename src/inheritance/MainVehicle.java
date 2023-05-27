package inheritance;

public class MainVehicle
{
    public static void main(String[] args)
    {
        Bike b1 = new Bike(11.0);
        System.out.println( b1.getFuelEfficiency(400));
        Car c1 = new Car(12);
        System.out.println(c1.getFuelEfficiency(10));

        Vehicle bike = new Bike(12);
        System.out.println(bike.getFuelEfficiency(100));

        Vehicle vehicle = new Vehicle(12);
        System.out.println(vehicle.getFuelEfficiency(100));
    }
}
