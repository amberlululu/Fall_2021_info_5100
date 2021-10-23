package SingletonExercise;

public class Database {
    // make constructor as private
    private Database(){};
    // create a private static instance

    private static Database _instance;
    // create a private static Object which will protect synchronize the entry
    private static Object obj = new Object();
    // create a getter for static instance
    public static Database get_instance() {
        if(_instance == null){
            synchronized (obj){
                if(_instance == null){
                    _instance = new Database();
                }

            }

        }
        return _instance;
    }




    public String getConnection(){
        return "You are connected";
    }
}



