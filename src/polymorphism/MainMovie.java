package polymorphism;

import inheritance.SalariedEmployee;

import java.util.Scanner;

public class MainMovie
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter ( A for adventure, C for comedy , S for scienceFiction and Q for qiut");
            String  type = sc.nextLine();
            if("Qq".contains(type))
            {
                break;
            }

            System.out.println("Enter movei name ");
            String moveiname = sc.nextLine();

            Movie movie = Movie.getMovie(type,moveiname);
            movie.watchMovie();
        }

    }
}
