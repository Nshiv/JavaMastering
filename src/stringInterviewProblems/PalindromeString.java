package stringInterviewProblems;

public class PalindromeString
{
 public static void main(String[] args)
 {
     System.out.println(getPalindrome("abb"));
 }
 public static boolean getPalindrome(String str)
 {
     StringBuilder builder = new StringBuilder();
     builder.append(str);
     builder.reverse();
     if(str.equalsIgnoreCase(builder.toString()))
     {
        return true;
     }
     return false;

 }
}
