package strings;

//this only a word reverser
// input : My city is agra and output: agra is city My
public class Reversewords
{
    public static void main(String[] args)
    {
       String str = "My city is agra";
       String reversed = getReverseWords(str);
        System.out.println(reversed);
    }
    public static String getReverseWords(String str)
    {
       String[] words=str.split("\\s+");
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]);
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--)
        {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }

        }return reversed.toString();

    }
}
