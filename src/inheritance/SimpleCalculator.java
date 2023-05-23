package inheritance;

public class SimpleCalculator
{
    double firstNmuner;
    double secondNUmber;

    public double addition()
    {
        double sum;
        return  sum = firstNmuner+secondNUmber;
    }

    public double subtraction()
    {
        double sub;
        return sub=firstNmuner-secondNUmber;
    }

    public double multiply()
    {
        double mul;
        return mul = firstNmuner*secondNUmber;
    }

    public double division()
    {
        double div;
        return div=firstNmuner/secondNUmber;
    }

    public int modulo()
    {
        int modulo;
        return modulo= (int) (firstNmuner%secondNUmber);
    }
    public double getFirstNmuner() {
        return firstNmuner;
    }

    public void setFirstNmuner(double firstNmuner) {
        this.firstNmuner = firstNmuner;
    }

    public double getSecondNUmber() {
        return secondNUmber;
    }

    public void setSecondNUmber(double secondNUmber) {
        this.secondNUmber = secondNUmber;
    }




}
