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
    }
}
