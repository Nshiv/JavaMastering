package polymorphism;
// casting with classes
public class NextMainMovie
{
    public static void main(String[] args) {
        // No casting needed
        Movie movie = Movie.getMovie("S","Avatar");
        movie.watchMovie();
        // need to cast here
        Adventure ad = (Adventure) Movie.getMovie("A","Avengers");
        ad.watchMovie();


    }
}
