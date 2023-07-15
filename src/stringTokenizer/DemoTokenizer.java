package stringTokenizer;

import java.util.StringTokenizer;

public class DemoTokenizer
{
    public static void main(String[] args) {

        String st = "THis is only for test data,updares,brodcast and many more ";
        String delimeter = ",";
        System.out.println(st.codePointAt(0));

        StringTokenizer tokenizer = new StringTokenizer(st);
        System.out.println(tokenizer.countTokens());// total tokens
        while (tokenizer.hasMoreTokens())
        {
            String token =tokenizer.nextToken();
            System.out.println(token);
        }
        System.out.println(tokenizer.countTokens());

    }
}
