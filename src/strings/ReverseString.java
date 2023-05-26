package strings;

public class ReverseString
{
    public static void main(String[] args)
    {
      reverseString("Find out Automation jobs");
    }
    public static void reverseString(String str)
    {
        StringBuilder reversed = new StringBuilder();
        for(int i =str.length()-1;i>=0;i--)
        {
            reversed.append(str.substring(i,i+1));

        }
        System.out.println(reversed.toString());

    }
}
