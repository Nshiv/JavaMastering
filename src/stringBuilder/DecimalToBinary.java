package stringBuilder;

public class DecimalToBinary
{
    public static void main(String[] args) {
        int x = 58;
        String out = getBinary(12);
        System.out.println(out);

    }

    public static String getBinary(int num)
    {
        StringBuilder sb = new StringBuilder();
     if(num==0)
     {
        sb.append(0);
     }
     else
     while(num>0)
     {
         int remainder = num%2;
         sb.insert(0,remainder);
         num = num/2;

     }return sb.toString();
    }
}
