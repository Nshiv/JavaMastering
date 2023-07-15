package stringBuilder;

import java.util.StringTokenizer;

public class TitleCase
{
    public static void main(String[] args) {
        String s = "the rocks on the beach";
        String out = getTitleCase(s);
        System.out.println(out);
    }

    public static String getTitleCase(String s)
    {
        StringTokenizer st = new StringTokenizer(s," ");
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreElements())
        {
            String token = st.nextToken();
            String data =token.substring(0,1).toUpperCase();
            String modifiedToken = data+token.substring(1);
            sb.append(modifiedToken);
            sb.append(" ");

        }
        return sb.toString();
    }
}
