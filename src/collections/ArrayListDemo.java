package collections;

import java.util.ArrayList;
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


    }
}
