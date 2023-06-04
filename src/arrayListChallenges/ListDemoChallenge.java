package arrayListChallenges;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ListDemoChallenge
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
     boolean flag =true;
     ArrayList<String>  groceries = new ArrayList<>();
     while(flag)
     {
         printactions();
         switch (Integer.parseInt(sc.nextLine()))
         {
             case 1 -> addItems(groceries);
             case 2 -> removeItem(groceries);
             default -> flag=false;
         }
         groceries.sort(Comparator.naturalOrder());
         System.out.println(groceries);

         }


     }


    public static void addItems(ArrayList<String> groceries)
    {
        System.out.println("Add Items seperated by Comma: ");
        String[] items = sc.nextLine().split(",");
        //groceries.addAll(List.of(items));
        for(String i :items)
        {
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed)<0)
            {
                groceries.add(trimmed);
            }
        }

    }

    public static void removeItem(ArrayList<String> groceries)
    {
        System.out.println("Enter items to remove seperated by comma");
        String[] items = sc.nextLine().split(",");
        for(String i:items)
        {
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }


    public static void printactions()
    {
        String textBlock = """
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:""";
        System.out.println(textBlock+" ");
    }
}
