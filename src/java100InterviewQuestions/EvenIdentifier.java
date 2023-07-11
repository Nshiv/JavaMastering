package java100InterviewQuestions;

import java.util.Scanner;

public class EvenIdentifier
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        boolean status = true;
        int n ;
        while (status)
        {

            n= sc.nextInt();
            if(n<=0)
            {
                System.out.println("Negatives and Zero are not allowed ");
            }
            else if (n%2==0)
            {
                System.out.println("Its a even");
                break;


            }
            else
            {
                sc.nextInt();
                System.out.println("Again please");
            }
        }
    }
}
