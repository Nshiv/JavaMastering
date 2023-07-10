package java100InterviewQuestions;

import java.util.Scanner;

public class ReverseNUmber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        getReversedNumber(number);
    }

    public static void getReversedNumber(int number)
    {
        String opNumber = String.valueOf(number);
        StringBuilder sb = new StringBuilder(opNumber);
        String nstring =sb.reverse().toString();
        System.out.println(Integer.parseInt(nstring));

    }


}
