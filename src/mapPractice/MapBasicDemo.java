package mapPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapBasicDemo
{
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("Agra",282006);
        map.put("Gurgaon", 122011);
        map.put("Delhi",110096);
        map.put("Banglore",764523);
        System.out.println(map);

        //map.keySet();
        Set<String> set = new HashSet<String>();
        set.addAll(map.keySet());
        System.out.println(set);

        System.out.println(map.containsKey("Agra"));

        System.out.println(map.containsValue(122011));

        System.out.println(map.get("Delhi"));


    }
}
