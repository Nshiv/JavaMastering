package strings;

public class ChatAtPractice
{
    public static void main(String[] args)
    {
        //find out first character
        String data = "New Procces";
        char ch =data.charAt(0);
        //priniting all the chars of string
        System.out.println(ch);
        for(int i=0;i<data.length();i++)
        {
            char ch1 = data.charAt(i);
            System.out.println(ch1);
        }
        //find out last element of string
        System.out.println(data.charAt(data.length()-1));
    }





}
