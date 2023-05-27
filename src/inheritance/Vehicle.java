package inheritance;

public class Vehicle
{
  private double fuelEfficiency;

  public Vehicle(double fuelEfficiency)
  {
    this.fuelEfficiency=fuelEfficiency;
  }

  public double getFuelEfficiency(double distance)
  {
    return distance*fuelEfficiency;
  }

}

 class Car extends Vehicle
{

  public Car(double fuelEfficiency) {
    super(fuelEfficiency);
  }
}

class Bike extends Vehicle
{

  public Bike(double fuelEfficiency) {
    super(fuelEfficiency);
  }
}


