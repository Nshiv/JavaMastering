package arrayListChallenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddPrefix {
    public static void main(String[] args) {
        List<String> myLIst = createList();
        System.out.println(myLIst);
        System.out.println(addPrefix(myLIst));
    }

    public static List<String> createList() {
        List<String> myList = new ArrayList<>();
        myList.add("John");
        myList.add("Cena");
        myList.add("Tim");
        myList.add("Cook");
        return myList;
    }

    public static List<String> addPrefix(List<String> list) {
        List<String> newList = new ArrayList<>();
        Iterator<String> iterator = list.iterator();
        String prefix = "Mr.";
        while (iterator.hasNext()) {
            String element = iterator.next();
            element = prefix + element;
            newList.add(element);
            System.out.printf("JUst fir====");
        }
        return newList;
    }
}
