public class MinutesToYear
{
    public static void main(String[]args)
    {
        System.out.println(getYears(60));
    }
    public static String getYears(int minutes)
    {
        if(minutes<0)
        {
            return "Invalid inputs";
        }
        else {
            int hrs = minutes / 60;
            int days = minutes / 1440;
            int remainingDays = (minutes / 1440) % 365;
            int year = minutes / 525600;
            return year + "Y" + remainingDays + "d";

        }

    }
}
