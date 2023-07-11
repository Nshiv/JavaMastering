package java100InterviewQuestions;

public class MaxSum
{
    public static void main(String[] args) {
        int[] arr1 = {45,67,94,56,78};
        int[] arr2 = {34,78,11,30};

        int max1 = getmax(arr1);
        int max2 = getmax(arr2);
        System.out.println(max1+" "+max2);
        int sum = max1+max2;
        System.out.println(sum);

    }

   public static int getmax(int[] arr)
   {
       int max = arr[0];
       for(int i=0;i<arr.length;i++)
       {
           if(max<arr[i])
           {
               max=arr[i];
           }
       }return max;
   }
}
