package strings;

public class TextBlock
{
    public static void main(String[] args)
    {
        String textblock = """
                                    Main Heading:
                                    \u2022 data member
                                    \u2022 second data member
                                         \u2022 sub data member""";
        System.out.println(textblock);

       /* String textblock1 = """
                
                *
                **
                ***
                ****
                
                """;
        System.out.println(textblock1);*/
    }
}
