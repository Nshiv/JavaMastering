package Loops;

public class SumOfMaxValusTwoarrays
{
    public static int getMax(int[] array)
    {
        int max = array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        return max;
    }

    public static void main(String[]args)
    {
        int[] array1 =  {45,67,903,56};
        int[] array2 = {334,564,75,89,23,10,3434};
        System.out.println(getMax(array1)+getMax(array2));
    }
}
