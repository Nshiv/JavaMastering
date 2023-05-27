package strings;

public class DeleteAtString
{
    public static void main(String[] args)
    {

        String str = "Data to test";
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        builder.deleteCharAt(0);
        System.out.println(builder);
    }
}
