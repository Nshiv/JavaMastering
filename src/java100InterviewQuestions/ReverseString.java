package java100InterviewQuestions;

public class ReverseString
{
    public static void main(String[] args) {
        String texts = "Normal words";

        StringBuilder sb = new StringBuilder(texts);
        sb.reverse();
        System.out.println(sb);
    }
}
