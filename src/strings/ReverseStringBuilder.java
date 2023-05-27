package strings;

public class ReverseStringBuilder
{
    public  static void main(String[] args)
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Save Forests");
        //revesing
        builder.reverse();
        System.out.println(builder);
    }
}
