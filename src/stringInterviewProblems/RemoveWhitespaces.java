package stringInterviewProblems;

public class RemoveWhitespaces
{
    public static void main(String[] args) {

        String test = "    Data to test        and Other       ";
       String  formatOut =test.replaceAll("\\s+"," ").trim();
        System.out.println(formatOut);
    }
}
