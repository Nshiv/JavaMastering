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

        // fill method in array
        int[] secondarray = new int[10];
        System.out.println(Arrays.toString(secondarray));
        Arrays.fill(secondarray,2);
        System.out.println(Arrays.toString(secondarray));

        //creating copy of an array
        int[] thirdarray = createRandomArray(8);
        System.out.println(Arrays.toString(thirdarray));

        int[] fourtharray = Arrays.copyOf(thirdarray,thirdarray.length);
        System.out.println(Arrays.toString(fourtharray));

        //sorting of copied array
        Arrays.sort(fourtharray);
        System.out.println(Arrays.toString(thirdarray));
        System.out.println(Arrays.toString(fourtharray));

        //Partial copy
        int[] smallArray = Arrays.copyOf(thirdarray,5);

        System.out.println(Arrays.toString(smallArray));

        //Larger array creation
        int[] lageArray = Arrays.copyOf(thirdarray,20);

        System.out.println(Arrays.toString(lageArray));




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
