package java100InterviewQuestions;

public class Swapping2
{
    public static void main(String[] args) {
        int a =10;
        int b=45;

        a = a+b;
        b= a-b;
        a= a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
