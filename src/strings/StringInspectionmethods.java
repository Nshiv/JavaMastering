package strings;

public class StringInspectionmethods
{
    public static void main(String [] args)
    {
        getinformation("Current city of mine is Agra");
        getinformation("");
        getinformation("    ");

    }

    public static void getinformation(String str)
    {
        //getting lenght of String
        int lenght = str.length();
        System.out.printf("Lenght of string is %d%n",lenght);

        //validate string is empty
        if(str.isEmpty())
        {
            System.out.println("String is empty");
            return;
        }
        //Validate string is blank
        if(str.isBlank())
        {
            System.out.println("string is Blank");
        }

        // finding out charcters asper position

        System.out.printf("Charcter at Position 0 is %c%n",str.charAt(1));

        //Last character
       System.out.printf("Last Character of string is %c%n",str.charAt(lenght-1));






    }
}
