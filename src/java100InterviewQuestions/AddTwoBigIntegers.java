package java100InterviewQuestions;

import java.math.BigInteger;
import java.util.Scanner;

public class AddTwoBigIntegers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first big number");
        String s1 = scanner.nextLine();
        System.out.println("Enter your send big enumber");
        String s2 = scanner.nextLine();

        BigInteger number1 = new BigInteger(s1);
        BigInteger number2 = new BigInteger(s2);
        BigInteger sum = number1.add(number2);
        System.out.println(sum);

    }

}
