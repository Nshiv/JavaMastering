package methodsPractice;

public class CatPlay
{
    public static void main(String[] args)
    {
        System.out.println(isCatPlaying(false, 26));
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(true,25));
        System.out.println(isCatPlaying(true,-1));
    }

    public static boolean isCatPlaying(boolean status, int time)
    {
        if(status==false || time<0)
        {
            return false;
        } else if (time<25 && time>45)
        {
         return false;
        } else if (time>=25 && time<=45)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
