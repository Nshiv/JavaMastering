package collections;

import java.util.ArrayList;
import java.util.List;

public class ListArrayList
{
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Data");
        System.out.println(list);

        //creating arralist with List of

        ArrayList<String>  newList = new ArrayList<>(List.of("data","pipeline","eloborate"));
        System.out.println(newList);

        // using addall
        list.addAll(newList);
        System.out.println(list);
    }
}
