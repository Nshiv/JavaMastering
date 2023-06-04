package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayList2Array
{
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(List.of("Jan","FEb","March","April"));
        String[] arrays =  list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(arrays));
    }
}
