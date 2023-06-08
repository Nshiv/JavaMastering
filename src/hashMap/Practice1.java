package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice1
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("8th " ,71);
        map.put("High School", 83);
        map.put("InterMediate",79);
        map.put("Graduation",67);

        //approch basic

        Set<String> set = map.keySet();
        for(String key : set)
        {
            System.out.println(key+"  "+ map.get(key));
        }

        // Recommended approch
        System.out.println("---------------------");

        for(Map.Entry<String,Integer> e : map.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}
