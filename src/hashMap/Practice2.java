package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Practice2
{
    public static void main(String[] args)
    {
        int[] age ={1,1,2,4,5,6,7,8,7,8};

        Map<Integer,Integer> frequency = new HashMap<>();
        for(int element :age)
        {
            if(frequency.containsKey(element))
            {
                int count = frequency.get(element);
                frequency.put(element,count+1);
            }
            else
            {
                frequency.put(element, 1);
            }
        }

        for(Map.Entry<Integer,Integer> e : frequency.entrySet())
        {
            int element = e.getKey();
            int frequenc = e.getValue();
            System.out.println(element+"  "+frequenc);
            System.out.println("step finished");

            System.out.println("ddvkfvhlnk");
        }

    }
}
