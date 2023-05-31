package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayDcendingOrder
{
    public static void main(String[] args) {
        int[] sortedarray = getSortedArray(new int[] {23,85,87,89});
        System.out.println(Arrays.toString(sortedarray));
    }

    public static int[] getRandomArray(int length)
    {
        Random random = new Random();
        int[] nArray = new int[length];
        for(int i=0;i<length;i++)
        {
            nArray[i]= random.nextInt(100);
        }
        return nArray;
    }
    public static int[] getSortedArray(int[] array)
    {
      //Arrays.sort(array);
      int[] sortedarray = Arrays.copyOf(array,array.length);
      System.out.println("Array before decending sorted"+Arrays.toString(sortedarray));
      int temp;
      boolean flag =true;
      while(flag) {
          flag = false;
          for (int i = 0; i < sortedarray.length - 1; i++) {
              if (sortedarray[i] < sortedarray[i + 1]) {
                  temp = sortedarray[i];
                  sortedarray[i] = sortedarray[i + 1];
                  sortedarray[i + 1] = temp;
                  flag = true;
              }
          }
      }
      return sortedarray;
    }
}
