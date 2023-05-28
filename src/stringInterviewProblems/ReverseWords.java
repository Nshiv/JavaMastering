package stringInterviewProblems;

public class ReverseWords
{
    public static void main(String[] args)
    {
     getReverseWords("Test string for updates");
    }
    public static void getReverseWords(String str)
    {
      String[] word = str.split("\\s+");
      StringBuilder reversed = new StringBuilder();
        for(int i=0;i<word.length;i++)
        {
            reversed.append(reverse(word[i]));
            if(i!=word.length-1)
            {
                reversed.append(" ");
            }
        }


        System.out.println(reversed);
    }
    public static String reverse(String word)
    {
        String rword="";
        for(int i=word.length()-1;i>=0;i--)
        {
            rword = rword+word.charAt(i);
        }
        return rword;
    }
}
