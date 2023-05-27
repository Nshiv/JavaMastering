package strings;

public class AppendInStringBuilder
{
    public static void main(String[] args)
    {
      StringBuilder str = new StringBuilder();
      StringBuilder  str1 = new StringBuilder();
      //added text
      str1.append("Objects tests ");
      System.out.println(str);
      str.append("Hi this one for test ");
      //passed an object here to append as arguments
      str.append(str1);
      System.out.println(str);
      //created a char array
      char test[] = {'a', 'b','c','d','e'};
        System.out.println(test);
        //passed char array to append in existing string
        str.append(test);
        System.out.println(str);
       // passed a string with its substring
        String data = " No is blaming you";
        System.out.println(str.append(data,6,10));

        //test with substring
        System.out.println(str.append(data.substring(3)));


    }


}
