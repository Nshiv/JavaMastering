package Loops;

public class SwitchDemo
{
    public static void main(String[] shiv)
    {
        char charValue = 'B';
        switch (charValue)
        {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Cigar");
                break;
            case 'D':
                System.out.println("Donkey");
                break;
            case 'E':
                System.out.println("Eye");
                break;
            default:
                System.out.println("None of them is matched");
        }
    }
}
