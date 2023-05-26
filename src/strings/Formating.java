package strings;

public class Formating
{
    public static void main(String[] args)
    {
        int age = 40;
        int birthYear = 2023-40;
        System.out.printf("Your age is %d, birthYear is %d\n", age,birthYear);
        System.out.printf("age =%d, birth Year = %d\n",age,birthYear);
        System.out.printf("Your age in float is %.0f\n",(float)age);

        //with string

        String test = String.format("Your age is %d%n",age);
        System.out.println(test);

        String year;
        year = "Your year of birth is %d ".formatted(birthYear);
        System.out.println(year);
    }
}
