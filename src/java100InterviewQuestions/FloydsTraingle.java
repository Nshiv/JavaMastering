package java100InterviewQuestions;

public class FloydsTraingle
{
    public static void main(String[] args)
    {
     getTraingle(7);
    }

    public static void getTraingle(int num)
    {
        int count =1;
        for(int i=1;i<=num;i++)
        {
            System.out.println();
            for(int j=1;j<=i;j++)
            {
                System.out.print(count);
                count++;
            }

        }
    }
}
