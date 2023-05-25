package knowledgeBase;

public class CalculatorMain
{
   public static void main(String[] args)
   {
       SimpleCalculator sc = new SimpleCalculator();
       sc.setFirstNmuner(10);
       sc.setSecondNUmber(5);
       System.out.println(sc.getFirstNmuner());
       System.out.println(sc.getSecondNUmber());
       System.out.println(sc.addition());
       System.out.println(sc.subtraction());
       System.out.println(sc.multiply());
       System.out.println(sc.division());
       System.out.println(sc.modulo());

   }
}
