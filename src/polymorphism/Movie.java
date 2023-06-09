package polymorphism;

import java.util.Locale;

public class Movie
{
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie()
    {
      String str = this.getClass().getSimpleName();
        System.out.println(title +" is "+ str +" film");
    }

    public static Movie getMovie(String type, String title)
    {
        return switch (type.toUpperCase().charAt(0))
        {
            case 'A'-> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S'-> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }


}

class  Adventure extends Movie
{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(" .. %s%n".repeat(3),
                "Excellent movie",
                 "Nice one ",
                  " Oscar material");
    }
}

class  Comedy extends Movie
{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(" .. %s%n".repeat(3),
                "Excellent comedy movie",
                "Nice comedy one ",
                "Comedy Happy Ending");
    }
}

class  ScienceFiction extends Movie
{
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(" .. %s%n".repeat(3),
                "great ScienceFiction movie",
                "Aliens worls",
                "when we will meet aliens?");
    }
}


