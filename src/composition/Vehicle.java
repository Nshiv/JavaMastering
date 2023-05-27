package composition;

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

class Bike
{
private Vehicle vehicle;
public int sideSeat;

public Bike(int sideSeat, double fuelEfficiency)
{
  this.vehicle= new Vehicle(fuelEfficiency);
  this.sideSeat=sideSeat;
}

public double getFuelEfficiency(double distance)
{
    return vehicle.getFuelEfficiency(distance);
}
}

class Car
{
 public int seats;
 private Vehicle vehicle;

 public Car(int seats, double fuelEfficiency )
 {
   this.vehicle=new Vehicle(fuelEfficiency);
   this.seats = seats;
 }
 public double getFuelEffiency(double distance)
 {
     return vehicle.getFuelEfficiency(distance);
 }
}


