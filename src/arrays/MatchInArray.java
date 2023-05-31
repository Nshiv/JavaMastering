package arrays;

import java.util.Arrays;

public class MatchInArray
{
    public static void main(String[] args) {
        //binary search >> implement sort first then search an element.
        String[] students = {"John","lorem","ipsum","tim","lorenz"};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        if(Arrays.binarySearch(students,"tim")>0)
        {
            System.out.println("Match found");
        }
        else
        {
            System.out.println("No match found");
        }

    }
}
