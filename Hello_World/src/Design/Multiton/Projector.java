package Design.Multiton;
import java.util.*;

public class Projector {
    // use hashmap to store projectors
    static HashMap<Integer, Projector> projectors = new HashMap<>();

    private Projector(){
        
    }



    private static Object obj = new Object();

    public static Projector getProjector(Integer id){
        // only one person can create new Projector
        if(!projectors.containsKey(id)){
            synchronized (obj){
                if(!projectors.containsKey(id)){
                    projectors.put(id, new Projector() );
                }

            }

        }

        return projectors.get(id);
    }
}