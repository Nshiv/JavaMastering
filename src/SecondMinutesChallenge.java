public class SecondMinutesChallenge
{
    public static void main(String[] args)
    {
        //System.out.println(getDurationString(5601));
        System.out.println(getDurationString(93,21));
    }

    public static String getDurationString(int seconds)
    {
        int minutes = seconds/60;
        int hours = minutes/60;
        int secondCount = seconds%60;
        int minutesCount = minutes%60;
        return  hours+"h" +minutesCount+"m"+secondCount+"s";
    }

    public static String getDurationString(int minutes, int seconds)
    {
        int total_time = minutes*60+seconds;
        String time = getDurationString(total_time);
      return  time;
    }
}
