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


    }
}
