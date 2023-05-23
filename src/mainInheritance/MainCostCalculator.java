package mainInheritance;

import inheritance.Calculator;
import inheritance.Carpet;
import inheritance.Floor;

public class MainCostCalculator
{
    public static void main(String[] args)
    {
        //test with one records
        Floor fl = new Floor(2, 1);
        Carpet cp = new Carpet(6);
        Calculator cl = new Calculator(fl, cp);
        System.out.println(cl.getTotalCost());

        // another records


    }
}
