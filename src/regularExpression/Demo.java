package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo
{
    public static void main(String[] args) {
        String s = "Normalize and updation quite perfection and improments";
        Pattern pt = Pattern.compile("[]");
        Matcher matcher = pt.matcher(s);
        String updated =matcher.replaceAll("0");
        System.out.println(updated);

    }
}
