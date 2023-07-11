package java100InterviewQuestions;

public class CompareTwoStrings
{
    public static void main(String[] args) {
        compareStrings("Test","test");

    }

    public static void compareStrings(String s1, String s2)
    {
        if(s1.compareTo(s2)>0)
        {
            System.out.println( s1+" is greater than "+s2);
        } else if (s1.compareTo(s2)<0)
        {
            System.out.println( s1+" is lesser than "+s2);
        }
        else
        {
            System.out.println("Matched");
        }

    }
}
