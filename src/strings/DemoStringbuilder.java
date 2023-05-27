package strings;

public class DemoStringbuilder
{
    public static void main(String[] args)
    {
      String str = "Good" + "morning!";
      str.concat("Saturday");

      StringBuilder builder = new StringBuilder("Good" + "morning");
      builder.append(" Saturday");

      StringBuilder build1 = new StringBuilder();
      StringBuilder build2 = new StringBuilder(34);
      build1.append("a".repeat(1001));
      build2.append("b".repeat(80));
      //Method calls
      //getInformation(str);
      //getInformation(builder);

      getInformation(build1);
      getInformation(build2);
    }
    public static void getInformation(String str)
    {
        System.out.println("String equals "+str);
        System.out.println("Lenght is "+str.length());

    }

    public static void getInformation(StringBuilder builder)
    {
        System.out.println("String equals "+builder);
        System.out.println("Lenght is "+builder.length());
        System.out.println("Capacity is "+builder.capacity());
    }
}
