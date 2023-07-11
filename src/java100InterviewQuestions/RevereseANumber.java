package java100InterviewQuestions;

public class RevereseANumber
{
    public static void main(String[] args)
    {
     int output = getReverseNumber(000001);
        System.out.println(output);
    }

    public static int getReverseNumber(int number)
    {
       int reversedNUmber =0;
       while (number!=0)
       {
           int lastDigit = number%10;
           reversedNUmber = (reversedNUmber*10)+lastDigit;
           number = (number/10);
       }
       return reversedNUmber;

    }
}
