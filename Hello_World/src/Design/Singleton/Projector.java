package Design.Singleton;

public class Projector {
    private static Projector _instance;
    private Projector(){ // No one can create an instance through default constructor

    }
    // lock synchronized part
    private static Object obj = new Object();

    public String name = "Default";

    public static Projector get_instance() {

        // only one can get access to this synchronized part
        // but take long time, so but could use double checking we check if the _instance == null
        if(_instance == null){
            synchronized (obj){
                if(_instance == null) {
                    _instance = new Projector();
                }
            }

        }

        // other people will have access to this part
        return _instance;
    }

    public static void  sampleFunction(){
        // Debug.log("inside sample function" + "value =" + value + userID)

    }
}
