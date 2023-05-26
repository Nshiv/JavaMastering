package strings;

public class StringInspectionmethods
{
    public static void main(String [] args)
    {
        getinformation("Current city of mine is Agra");
        //getinformation("");
        //getinformation("    ");

    }

    public static void getinformation(String str)
    {
        // 1. getting lenght of String
        int lenght = str.length();
        System.out.printf("Lenght of string is %d%n",lenght);

        // 2. validate string is empty
        if(str.isEmpty())
        {
            System.out.println("String is empty");
            return;
        }
        // 3.Validate string is blank
        if(str.isBlank())
        {
            System.out.println("string is Blank");
        }

        // 4. finding out charcters asper position

        System.out.printf("Charcter at Position 0 is %c%n",str.charAt(1));

        // 5.Last character
        System.out.printf("Last Character of string is %c%n",str.charAt(lenght-1));

        // Index of A in String
        System.out.printf("Index of character A is %d%n",str.indexOf("A"));






    }
}
