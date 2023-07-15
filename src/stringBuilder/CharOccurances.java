package stringBuilder;

import java.util.Scanner;

public class CharOccurances
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();
        System.out.println("Enter char");
        String inputChar = sc.next();
        char ch = inputChar.charAt(0);

        System.out.println(getoccurances(input,ch));

    }

    public static int getoccurances(String str,char ch )
    {
        StringBuffer sb = new StringBuffer(str);
        int count =0;
        for(int i=0;i<str.length();i++)
        {
           if(sb.charAt(i)==ch)
           {
               count++;
           }
        }
        return count;

    }
}
