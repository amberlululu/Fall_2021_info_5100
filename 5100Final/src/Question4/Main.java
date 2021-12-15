package Question4;
import java.text.SimpleDateFormat;
import java.util.function.Predicate;
import java.util.stream.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Netflix netflix1 = new Netflix("Netflix1");

        netflix1.setGenreList(generateGenres());
        Genre childMovie = netflix1.getGenre("Child Movie");
        addChildMovies(childMovie);


        Date dateTest1 = new GregorianCalendar(1990, Calendar.FEBRUARY, 1).getTime();

        netflix1.genreList.stream()
                .flatMap(genre -> genre.getMovies().stream())
                .filter(movie -> movie.getReleaseDate().before(dateTest1))
                .forEach(movie -> System.out.println(movie.getTitle() + "(Classic)"));

        //Create a predicate for release date before 2000 and a predicate for release date before 1990
        //and then Chain the predicates for finding movies between 1990 and 2000.

        Date dateTest2 = new GregorianCalendar(2000, Calendar.FEBRUARY, 1).getTime();

        Predicate<Movie> after1990 = movie -> movie.getReleaseDate().after(dateTest1);
        Predicate<Movie> before2000 = movie -> movie.getReleaseDate().before(dateTest2);


        printMovieByReleaseDate(netflix1.getGenreList(), "movie after 1990", after1990);
        printMovieByReleaseDate(netflix1.getGenreList(), "movie before 2000", before2000);


        //Get the latest 3 movies released using .limit() method of stream

        List<Movie> ans = netflix1.getGenreList().stream()
                .flatMap(genre -> genre.getMovies().stream()).sorted(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.getReleaseDate().compareTo(o1.getReleaseDate());
            }
        }).limit(3).collect(Collectors.toList());




        //Write a method which that will add release year in the title of the movie and return the title and
        //then use this method for all the movies.

        netflix1.getGenreList().stream()
                .flatMap(genre -> genre.getMovies().stream())
                .forEach(movie -> System.out.println(movie.getTitle() + movie.getReleaseDate()));




        //Sorting on one of the feature(Ex: Released year or title) which will use comparator.


             for(Genre genre : netflix1.getGenreList()){
                    Collections.sort(genre.getMovies(), (movie1, movie2)-> movie1.getTitle().compareTo(movie2.getTitle()));

                }


                netflix1.getGenreList().stream()
                        .flatMap(genre -> genre.getMovies().stream())
                        .forEach(movie -> System.out.println(movie.getTitle()) );




    }
    private static void printMovieByReleaseDate(List<Genre> list, String strCondition,
                                                Predicate<Movie> dateCondition) {

        System.out.println(strCondition);
        System.out.println("*************");

        for (Genre genre : list) {
            for(Movie movie : genre.getMovies()){
                if (dateCondition.test(movie)){
                    System.out.println(movie.getTitle() + " release Date : " + movie.getReleaseDate());
                }

            }

        }

    }




        private static ArrayList<Genre> generateGenres(){
            Genre childMovie = new Genre("Child Movie");
            Genre horrorMovie = new Genre("Horror Movie");

            ArrayList<Genre> list = new ArrayList<>();
            list.add(childMovie);
            list.add(horrorMovie);
            return list;
        }

        private static  void addChildMovies(Genre childMovie){
            Date date1 = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
            Date date2 = new GregorianCalendar(2008, Calendar.APRIL, 19).getTime();
            Date date3 = new GregorianCalendar(2012, Calendar.AUGUST, 26).getTime();
            String[] actorArray1 = {"Dennis", "Lucy", "Lily"};
            String[] actorArray2 = {"John", "CiCi", "Ken"};
            String[] actorArray3 = {"Victoria", "Andy", "Lily"};

            ArrayList<String> actorList1 = new ArrayList<>(Arrays.asList(actorArray1));
            ArrayList<String> actorList2 = new ArrayList<>(Arrays.asList(actorArray2));
            ArrayList<String> actorList3 = new ArrayList<>(Arrays.asList(actorArray3));
            Movie movie1  = new Movie("Happy Day with My Family ", date1, actorList1,"Alex Happy" );
            Movie movie2 = new Movie("My Mum", date2, actorList2, "Ann Lucy");
            Movie movie3 = new Movie("My best Friend", date3, actorList3, "Ruby Wu");
            childMovie.addMovie(movie1);
            childMovie.addMovie(movie2);
            childMovie.addMovie(movie3);

        }















}
