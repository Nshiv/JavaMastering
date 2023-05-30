package arrays;

import java.util.Arrays;
import java.util.Random;

public class RandomArray
{
    public static void main(String[] args) {
        int[] array1 = createRandomArray(12);
        /*for(int element : array1)
        {
            System.out.print(element+" ");
        }*/

        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

    }

    public static int[]  createRandomArray(int length)
{
    Random random = new Random();
    int[] newInt = new int[length];
    for(int i=0; i<length;i++)
    {
        newInt[i]=random.nextInt(100);
    }
    return newInt;

}


}
