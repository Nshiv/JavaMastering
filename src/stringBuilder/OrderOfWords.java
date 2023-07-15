package stringBuilder;

public class OrderOfWords
{
    public static void main(String[] args) {

        String s = "Israel battels with courage";
        String s1 = getReversedWords(s);
        System.out.println(s1);

    }

    public static String getReversedWords(String str)
    {
        StringBuilder stringBuilder = new StringBuilder();
        String[] array =str.split(" ");
        for(int i= array.length-1;i>=0;i--)
        {
            stringBuilder.append(array[i]);
            if(i>0)
            {
                stringBuilder.append(" ");
            }

        }
      return  stringBuilder.toString();
    }
}
