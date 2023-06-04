package collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrderOfList
{
    public static void main(String[] args) {

        List list = new ArrayList<>();
        //adding a list
        list.addAll(List.of("Functional","Unit","Integration","System INegration"));
        //adding a element

        //list.add(1);
       // list.add(2);
       // list.add(3);

        //adding array

        String[] newArray = {"data","base","Testing"};
       // list.add(Arrays.toString(newArray));

        //adding element
        List<Integer> primeNumber = new ArrayList<>();
        primeNumber.add(1);
        primeNumber.add(2);
        primeNumber.add(3);
        primeNumber.add(5);
        primeNumber.add(7);
        List<Integer> prime = new ArrayList<>();
        //list.addAll(primeNumber);

        System.out.println(list);

        System.out.println(list.indexOf(1));
        System.out.println(list.indexOf("Unit"));
        //System.out.println(list.indexOf(newArray));



        // Natual order crration : sorting

        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        list.sort(Comparator.reverseOrder());
        System.out.println(list);


    }
}
