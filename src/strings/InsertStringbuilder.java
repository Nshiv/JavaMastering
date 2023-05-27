package strings;

public class InsertStringbuilder
{
    public static void main(String[] args)
    {
        StringBuilder builder = new StringBuilder();
        //inserted a word at 0 point
        builder.insert(0,"Inserted ");
        System.out.println(builder);
        //append a new word
        builder.append("New word added now");
        System.out.println(builder.insert(0,"* "));


    }
}
