package polymorphism;
//static polymorphism
//compile time polymorsims
//early binding polymorphism

public class Calculator
{
    public int add(int a, int b)
    {
       return a+b;
    }

    public double add(double a, double b)
    {
        return a+b;
    }

    public int add(int a, int b, int c)
    {
        return a+b+c;
    }

    public double add(double a, double b, double c)
    {
        return a+b+c;
    }

    public static void main(String[] args)
    {
        Calculator cal = new Calculator();
        System.out.println(cal.add(3,5));
        System.out.println(cal.add(1,4,8));
        System.out.println(cal.add(3.5,7.9));
        System.out.println(cal.add(1.5,6.8,1.6));
    }
}
