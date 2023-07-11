package java100InterviewQuestions;

public class PrintInteger
{

    // Basic approach
 /*   public static void main(String[] args) {
        //printing integer from -10 to 20
        for(int i=-10;i<20;i++)
        {
            System.out.println(i);
        }
    }*/

    //Creation of generic message

    public static void main(String[] args)
    {

     int[] output = getIntegers(5,10);
     for (int i=0;i<=output.length;i++)
     {
         System.out.println(output[i]);
     }
    }

    public static int[] getIntegers(int start, int end)
    {
       int[] elements = new int[getTotalIntegers(start,end)];
       for(int i=0;i<elements.length;i++)
       {
         elements[i]=start++;
       }
       return elements;

    }

    public static int getTotalIntegers(int start, int end)
    {
        return  end-start;
    }
}
