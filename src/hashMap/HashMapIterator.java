package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIterator
{
    public static void main(String[] args)
    {
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("Amul",45.6);
        hm.put("Farmery",Double.parseDouble("85"));
        hm.put("Mother Dairy",76.9);
        hm.put("Paras",89.0);

        System.out.println(hm);

        //Creating an iterator
        //preferred approch

        for(Map.Entry<String, Double> e : hm.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }

        // second approch
        System.out.println(" ------------------------------");

        Set<String> st = hm.keySet();
        for(String key : st)
        {
            System.out.println(key+"  "+ hm.get(key));
        }


    }
}
