package java100InterviewQuestions;

public class ArmStrong
{
    public static void main(String[] args) {
       int num =1634;
       int temp =num;
       int digitCount = String.valueOf(num).length();
       int sum =0;
     while(temp!=0)
     {
         int digit = temp%10;
         sum = sum+(int) Math.pow(digit,digitCount);
         temp=temp/10;
     }
     if(sum==num){
         System.out.println("Its arm");
     }
     else
     {
         System.out.println("Not");
     }


    }
}
