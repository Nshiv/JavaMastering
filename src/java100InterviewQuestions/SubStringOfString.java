package java100InterviewQuestions;

public class SubStringOfString
{
    public static void main(String[] args) {
        String text = "Newton";
        int length = text.length();
        for(int i=0;i<length;i++)
        {
            for(int j=i+1;j<=length;j++)
            {
                String nString= text.substring(i,j);
                System.out.println(nString);
            }
        }
    }
}
