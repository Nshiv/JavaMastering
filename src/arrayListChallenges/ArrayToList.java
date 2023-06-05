package arrayListChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList
{
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        String[] students = {"JOhn","wick","newton","chancelor"};
        names.addAll(Arrays.asList(students));
        System.out.println(names);

        names.addAll(Arrays.asList("NewNames","atal"));
        System.out.println(names);

        System.out.println(names.contains("atal"));

        names.removeIf(s -> s.charAt(0)=='N');
        System.out.println(names.contains("NewNames"));
    }
}
