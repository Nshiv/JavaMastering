package java100InterviewQuestions;

import java.util.Scanner;

public class PassFailed
{
    public static void main(String[] args) {
        float passingmarks = 65;
        try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your passing amrks");
        float stu_marks = scanner.nextFloat();
            if (stu_marks >= passingmarks) {
                System.out.println("Passed ... congratulations");
            } else {
                System.out.println("Failed");
            }
        }catch (Exception e)
        {
            System.out.println("Enter correct inputs");
        }
    }

}
