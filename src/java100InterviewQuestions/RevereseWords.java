package java100InterviewQuestions;

public class RevereseWords
{
    //reverse only words

    public static void main(String[] args) {
        String texts = "Tuf Gaming";
        String[] input = texts.split(" ");
        String output ="";
        for(int i=0;i<input.length;i++)
        {
           StringBuilder sb = new StringBuilder(input[i]);
           sb.reverse();
           output.concat(input[i]);

        }
    }
}
