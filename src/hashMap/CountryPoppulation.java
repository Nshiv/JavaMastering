package hashMap;
import java.util.HashMap;
public class CountryPoppulation
{
    public static void main(String[] args)
    {
      HashMap<String,Integer> population = new HashMap<>();
      population.put("India",145);
      population.put("China",141);
      population.put("US",35);
      population.put("Indonesia",31);
      population.put("Pakistan",30);
      population.put("Bangladesh",29);
      population.put("Nigeria",28);
      population.put("Brazil",27);
        System.out.println(population);

        System.out.println(population.get("Idia"));

    }

}
