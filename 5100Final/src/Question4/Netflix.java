package Question4;
import java.util.*;
import java.util.stream.*;
public class Netflix {
    public String name;
    public ArrayList<Genre> genreList;

    public Netflix(String name){
        this.name = name;
        this.genreList = genreList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenreList(ArrayList<Genre> genreList) {
        this.genreList = genreList;
    }


    public List<Genre> getGenreList() {
        return genreList;
    }

    public Genre getGenre(String GenreName){
        ArrayList<Genre> filter = (ArrayList<Genre>) genreList.stream()
                .filter(genre -> genre.getName().equalsIgnoreCase(GenreName))
                .collect(Collectors.toList());
        if(filter.size() == 0) return null;
        return filter.get(0);
    }


}

