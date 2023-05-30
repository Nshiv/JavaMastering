package arrays;

public class ArrayOps
{
    public static void main(String[] args) {
        int[] newArray;
        newArray=new int[10];

        // creating arrays values
        for(int i=0;i<newArray.length;i++)
        {
            newArray[i]=newArray.length-i;
        }
        for(int i=0; i<newArray.length;i++)
        {
            System.out.print(newArray[i]+" ");
        }
        System.out.println("---------------");
        for(int element:newArray)
        {
            System.out.print(element+" ");
        }
    }
}
