package Question4;
import java.util.*;

public class Genre {
    private String name;
    private ArrayList<Movie> movies;

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public Genre(String name ){
        this.name = name;
        this.movies = movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }



}
