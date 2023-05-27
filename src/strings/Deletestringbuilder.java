package strings;

public class Deletestringbuilder
{
    public static void main(String[] args)
    {
        StringBuilder builder = new StringBuilder();
        //append a string
        builder.append("This is agra the city of Tejo mahalaya");
        //delete first caharacter
        builder.deleteCharAt(0);
        System.out.println(builder);
        //deleted a specified with in index
        builder.delete(0,4);
        System.out.println(builder);
    }
}
