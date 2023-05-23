package mainInheritance;

import inheritance.Car;

public class MainCar
{
    public static void main(String[] args)
    {
        Car cr = new Car();
        cr.setMaker("Maruti");
        cr.describecar();

        Car ob = new Car();
        ob.setMaker("Toyota");
        ob.describecar();



    }
}
