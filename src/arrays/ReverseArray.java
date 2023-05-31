package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray
{
    public static void main(String[] args) {
        int[] r_array = getInputs();
        System.out.println(Arrays.toString(r_array));
        getSwappedArray(r_array);
        System.out.println("final array"+ Arrays.toString(r_array));
    }
    public static int[] getInputs()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer number comma seperated");
        String inputs = sc.next();
        String[] inputsArray = inputs.split(",");
        int[] reqArray = new int[inputsArray.length];
        for(int i=0; i<reqArray.length;i++)
        {
            reqArray[i]=Integer.parseInt(inputsArray[i]);
        }
        return reqArray;
    }

    public static void getSwappedArray(int[] array)
    {
        //int temp;
        int max_Index = array.length-1;
        int half_index = array.length/2;
        for(int i=0; i<half_index;i++)
        {
           int temp = array[i];
           array[i]= array[max_Index-i];
           array[max_Index-i]=temp;
        }
        System.out.println(Arrays.toString(array));

    }
}
