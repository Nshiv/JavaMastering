package strings;

public class Stringinspection2
{
    public static void main(String[] args)
    {
        getStringinformation("string operations are going one");

    }

    public static void getStringinformation(String str)
    {
        String str1 ="String operations are going one";
        String stt = new String("string operations are going one");
        if(str.isEmpty()==true || str.isBlank()==true)
        {
            System.out.println("String is Eighter Blank or empty");
        }
        else
        {
            System.out.println("Go ahead for string operatiuons");
        }

        // 1. Starts with function if inputs are provided like "        a"

        //System.out.println(str.trim().startsWith("a"));
        System.out.println(str.startsWith("S"));

        // inputs is string as a word
        System.out.println(str.startsWith("Sp"));

        // 2. Contains validity

        System.out.println(str.contains("operations"));
        System.out.println(str.contains("c"));

        //equal validations

        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.equals(str1));
        System.out.println(str.equals(stt));

        //Compare to method

        System.out.println(str.compareTo(stt));
        System.out.println(str.compareTo(str1));
        System.out.println(str1.compareTo(stt));

        // with igonring case sensitivity

        System.out.println(str.compareToIgnoreCase(str1));
    }

}
