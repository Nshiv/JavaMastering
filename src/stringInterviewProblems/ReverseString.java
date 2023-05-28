package stringInterviewProblems;

public class ReverseString
{
  public static void main(String[] args)
  {
      System.out.println(getReverseString("The glass is half full"));
      System.out.println(getReverseString1("The glass is half full"));
  }

  public static String getReverseString(String str)
  {
     StringBuilder builder = new StringBuilder(str);
     builder.reverse();
     return builder.toString();
  }

  public static String getReverseString1(String str)
  {
      String nstr="";
      for(int i=str.length()-1;i>=0;i--)
      {
          nstr = nstr+str.charAt(i);
      }
      return nstr;
  }
}


