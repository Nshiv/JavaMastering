package strings;

public class Stringmanipulation
{
    public static void main(String[] args)
    {
        //manipulateString("    This is high time to practice code.   ");
       getSubString("New journey Begins");
        dateConverter("11/04/2025");
    }
    public static  void manipulateString(String str)
    {
        //concact method
        String nStr = "    Agreed !yes it is.   ";
        System.out.println(str.concat(nStr));

        //upper case
        System.out.println(str.toUpperCase());
        //lower case
        System.out.println(str.toLowerCase());

        //trim
        System.out.println(str.trim());

        //replace
        System.out.println(str.replace("T","Z"));
        //replace word
        System.out.println(str.replace("high","low"));

        //subString asper space

    }

    public static void getSubString(String str)
    {
        //with one parameter start index
        System.out.println(str.substring(1));
        // two paramenetrt
        String new1 = str.substring(5,13);
        System.out.println(new1);
    }

    public static void dateConverter(String date)
    {
        //   22/12/2023
        int index1 = date.indexOf("/");
        String day = date.substring(0,index1);
        System.out.println(day);
        int index2 = date.indexOf("/",index1+1);
        String month = date.substring(index1+1,index2);
        System.out.println(month);
        int yearindex = date.lastIndexOf("/");
        String year = date.substring(yearindex+1);
        System.out.println(year);
    }
}
