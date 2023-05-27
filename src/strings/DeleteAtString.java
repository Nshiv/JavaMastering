package strings;

public class DeleteAtString
{
    public static void main(String[] args)
    {

        String str = "Data to test";
        StringBuilder builder = new StringBuilder();
        //appending dtring to stringbuider class
        builder.append(str);
        //deleting value of zeros position
        builder.deleteCharAt(0);
        System.out.println(builder);
        // inserting deleted element via insert method
        builder.insert(0,"D");
        System.out.println(builder);

        // deleting a char sequence via delete menthod with two aruments
        builder.delete(0,4);
        System.out.println(builder);
    }
}
