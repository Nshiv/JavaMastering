package collections;

import java.util.Arrays;
import java.util.List;

public class ArrayArrayList
{
    public static void main(String[] args) {
        String[] students = new String[] {"Rohan", "Sohan","Mohan"};
        //can use list too but used var keyword
        var liststu = Arrays.asList(students);
        System.out.println(liststu);

        //can not add / remove as Origin string[] is immutables
        liststu.add("new data");
        System.out.println(liststu);

    }
}
