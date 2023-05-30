package arrays;

public class ArrayDemo1
{
    public static void main(String[] args) {
        int[] myArray = new int[10];
        myArray[5]=50;

        double[] myarray1 = new double[10];
        myarray1[2]=56.89;

        //array initialiser
        int[] arrayDemo = new int[] {10,20,40,60};

        int[] arraydemo1 = {78,56,89,9,545,456546,};

        //lenght
        System.out.println(arrayDemo.length);

        // value

        System.out.println(arrayDemo[0]);
        System.out.println(arraydemo1[4]);

        //last element of aaray
        System.out.println(arraydemo1.length-1);

        //traversing to all array element

        for(int i=0; i<arraydemo1.length;i++)
        {
            System.out.println(arraydemo1[i]);
        }


    }
}
