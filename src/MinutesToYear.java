public class MinutesToYear
{
    public static void main(String[]args)
    {
        System.out.println(getYears(527040));
    }
    public static String getYears(int minutes)
    {
        int hrs = minutes/60;
        int days = minutes/1440;
        int remainingDays = (minutes/1440)%365;
        int year = minutes/525600;

        return year +"Y"+remainingDays +"d";

    }
}
