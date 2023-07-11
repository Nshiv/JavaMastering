package java100InterviewQuestions;

public class TempConverter
{
    public static float getcelcius(float faren )
    {
       float celcius = ((5*faren)-160)/9;
       return celcius;
    }

    public static void main(String[] args) {
        float cel = getcelcius(0);
        System.out.println(cel+"\u00B0C");
    }
}
