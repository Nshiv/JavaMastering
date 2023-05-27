package strings;

public class ReplaceStringBuilder
{
    public static void main(String[] args)
    {
        StringBuilder builder = new StringBuilder("Hello Saturday!");
        String data = "new data";
        //replace asper index
        builder.replace(7,builder.length(),data);
        System.out.println(builder);
        //at zeroth position
        builder.replace(0,0,"tata bye bye");
        System.out.println(builder);
    }
}
