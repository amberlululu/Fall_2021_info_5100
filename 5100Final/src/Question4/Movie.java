package Question4;
import java.util.*;
import java.util.stream.*;

public class Movie {
    //Title of movie, Release date, List of actors, Director
    private String title;
    private Date releaseDate;
    private List<String> actorList;
    private String director;

    public Movie(String title, Date releaseDate, List<String> actorList, String director){
        this.title = title;
        this.releaseDate = releaseDate;
        this.actorList = actorList;
        this.director = director;

    }


    public String getTitle() {
        return title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public List<String> getActorList() {
        return actorList;
    }

    public String getDirector() {
        return director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setActorList(List<String> actorList) {
        this.actorList = actorList;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
