package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo
{
    public static void main(String[] args) {
        //creating scanner unput variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Number please");
        int input =sc.nextInt();

        //creating a arraylist
        ArrayList students = new ArrayList();

        //adding number, string, variable, double
        students.add(1);
        students.add("shiv");
        students.add(10.5);
        students.add(input);
        System.out.println(students);

        //deleting records from zeroth index
       students.remove(0);
       System.out.println(students);

        //adding another elements
        students.add("city");
        students.add("new develppment");
        System.out.println(students);

        //validating contains with exisiting values of list
        System.out.println(students.contains(10.6));

        // clear list
        students.clear();
        System.out.println(students);

        //adding again
        students.add(0,input);

        // getting an element asper index
        System.out.println(students.get(0));

        //
        students.add("shiv");
        students.add("Km");

        //Validating is emply
        System.out.println(students.isEmpty());

        // getting last index of students reference variable
        students.lastIndexOf(students);

        //ceating sublist
        List sublist = students.subList(0,3);
        System.out.println(sublist);

        //adding array to the LIst
        String[] fruits = {"Apples","Bananas","Mnagoes","Peaches"};
        students.add(Arrays.toString(fruits));
        System.out.println(students);;

        //adding a new List
        String[] flour = {"wheat","bajra"};
        List newone = List.of(flour);
        students.add(newone);
        System.out.println(students);

        //getting a array from list
        System.out.println(students.get(3));


    }
}
