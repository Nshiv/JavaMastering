package java100InterviewQuestions;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubStringswithList
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: - ");
        String input = sc.nextLine();
        List<String> outputs = getSubstrings(input);

        for (String t : outputs)
        {
            System.out.println(t);
        }

    }

    public static List<String> getSubstrings(String str)
    {
       int length = str.length();
       List<String> substrings = new ArrayList<>();
       for(int i=0;i<length;i++)
       {
           for(int j=i+1;j<=length;j++)
           {
               String substr = str.substring(i,j);
               substrings.add(substr);
           }
       }return substrings;
    }
}
