package java100InterviewQuestions;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find factorial");
        int user_input = sc.nextInt();

       if(user_input<0)
       {
           System.out.println("Negative inputs or invalid inputs are not allowed");
       }
       else
       {
           System.out.println(getFactorial(user_input));
       }
    }

    public static int getFactorial(int input)
    {
        int factorial =1;
        for(int i=1;i<=input; i++ )
        {
             factorial= factorial* i;
        }
        return factorial;
    }
}
