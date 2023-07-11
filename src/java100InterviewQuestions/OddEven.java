package java100InterviewQuestions;

import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int user_input = scanner.nextInt();

        if(user_input%2==0)
        {
            System.out.println(user_input+"  is Even");
        }
        else
        {
            System.out.println(user_input+" is odd");
        }
    }
}
