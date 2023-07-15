package stringBuilder;

public class Palindrom
{
    public static void main(String[] args) {
        String s = "Level";
        boolean outcome = isPalindrome(s);
        System.out.println(outcome);

    }
    public static boolean isPalindrome(String str)
    {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for(int i=chars.length-1;i>=0;i--)
        {
            sb.append(chars[i]);
        }
        System.out.println(sb.toString());
        if(str.equalsIgnoreCase(sb.toString()))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
