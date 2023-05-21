package methodsPractice;

public class AreaOverloading
{
    public static void main(String[] args)
    {
        System.out.println(getArea(4,5));
        System.out.println(getArea(5));
    }

    public static double getArea(double radious)
    {
       double area = (3.14)*(radious*radious);
       return area;
    }

    public static double getArea(double x, double y)
    {
        return x*y;
    }
}
