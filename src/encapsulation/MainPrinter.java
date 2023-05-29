package encapsulation;

public class MainPrinter
{
    public static void main(String[] args)
    {
       Printer printer = new Printer(120, true);
       System.out.println(printer.getTonerLevel());

        int pagesPrinted = printer.printPages(13);
        System.out.printf("Total Pages printed are: %d",pagesPrinted);

        System.out.println();
        int pagesPrinted1 = printer.printPages(130);
        System.out.printf("Total Pages printed are: %d",pagesPrinted1);

    }
}
