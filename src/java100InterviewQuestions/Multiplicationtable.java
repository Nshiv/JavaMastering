package java100InterviewQuestions;

import java.util.Scanner;

public class Multiplicationtable
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to create a table");
        int number = sc.nextInt();
        getMultiplicationtable(number);

    }

    public static void getMultiplicationtable(int num)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(num + "* " +i+ " = "+ num*i );
        }
    }
}
