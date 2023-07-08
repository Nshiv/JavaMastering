package java100InterviewQuestions;

public class LargestNumber
{
    /*public static void main(String[] args) {
        int x,y,z;
        x=324324; y =56; z=90;

        if((x>y) & (x>z) )
        {
            System.out.println("Largest is x"+x);
        } else if ((z>x) & (z>y))
        {
            System.out.println("z is largest "+z);
        }
        else if((y>x) & (y>z))
        {
            System.out.println("Largext is y "+y);
        }
    }*/

    public static void main(String[] args) {
        int x,y,z;
        x=241; y =56; z=90;

        int largest = (x>y)?((x>z)? x:y) : ((y>z)? y:z);
        System.out.println(largest);

    }



}
