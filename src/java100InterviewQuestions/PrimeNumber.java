package java100InterviewQuestions;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int count =0;
        int number =7;
        for(int i=2;i<=number;i++)
        {
           if(number%i==0)
           {
               count++;
           }
        }
        if(count==1)
        {
            System.out.println("its a prime");
        }
        else {
            System.out.println("Not a prime");
        }

    }


}
