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
      population.put("India",100/3);

      //printing complete HashMap of given values
       // System.out.println(population);
      //Printing only one value of given key
       // System.out.println(population.get("India"));

        //Vlaidating if there is any key present or not
        //return type is true or false;
        //System.out.println(population.containsKey("Brazil"));
        //System.out.println(population.containsKey("China"));

        //removing a key from hashmap

        System.out.println(population.remove("China",140));
        System.out.println(population.remove("India"));
        System.out.println(population);

        //getting the size

        System.out.println(population.size());

        //getting check wether  is emplty or not
        System.out.println(population.isEmpty());

        //clear the map
        population.clear();
       //
        System.out.println(population);


    }

}
