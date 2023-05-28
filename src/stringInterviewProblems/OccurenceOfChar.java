package stringInterviewProblems;

public class OccurenceOfChar
{
    public static void main(String[] args)
    {
      getOccurence("Liminted data for tada",'a');
    }

    public static void getOccurence(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println(count);

    }
}
