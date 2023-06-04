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

        //getting index of elements in lsit

        System.out.println(list.indexOf("data"));
        System.out.println(list.indexOf("Data"));

        // adding few elements

        list.add("England");
        list.add("India");
        list.add("US");

        //remove all

        list.removeAll(List.of("data","Data"));
        System.out.println(list);




    }
}
