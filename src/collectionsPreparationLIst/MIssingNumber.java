package collectionsPreparationLIst;

public class MIssingNumber
{
    public static void main(String[] args)
    {
        int[] myarray = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,32};
        System.out.println(findMissingNUmber(myarray));

    }
    public static int findMissingNUmber(int[] array)
    {
        int n = array.length+1;
        int totalsum = n*(n+1);
        int arraysum=0;
        for(int i=0;i<array.length;i++)
        {
            arraysum= arraysum+array[i];
        }
        return totalsum-arraysum;
    }
}
