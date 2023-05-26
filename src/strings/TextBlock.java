package strings;

public class TextBlock
{
    public static void main(String[] args)
    {
        String textblock = """
                                    Main Heading:
                                    \u2002 data member
                                    \u2002 second data member
                                         \u2002 sub data member""";
        //System.out.println(textblock);

        String textblock1 = """
                
                *
                **
                ***
                ****
                
                """;
        System.out.println(textblock1);
    }
}
