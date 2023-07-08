package java100InterviewQuestions;

import java.util.Scanner;

public class MultipleUserInputs
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int age = 0;
        String favmovie = "";
        boolean done = false;
        while (!done) {
            System.out.println("Please choose options asper the intructions");
            System.out.println("1: Enter your name");
            System.out.println("2: enter your age");
            System.out.println("3: enter favorite movie");
            System.out.println("4: want to enter more?");

            int user_input = scanner.nextInt();
            scanner.nextLine();

            switch (user_input)
            {
                case 1:
                    System.out.println("Your name please");
                    name=scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Your age please");
                    age =scanner.nextInt();
                    break;
                case 3:
                    System.out.println("your movie please");
                    favmovie=scanner.nextLine();
                    break;
                case 4:
                    done = true;
                    break;
                default:
                    System.out.println("Invalid option, please try again");
            }
        }

        System.out.println(name+"    enterered Name");
        System.out.println(age+"     Enteered age");
        System.out.println(favmovie+"    Entered moview");
    }
}
