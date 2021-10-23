package ClassAbstractExercise;

public class Phychiatrist {

    public Phychiatrist(){

    }



    public void examine(Moody moody){
        System.out.println("How are you feeling today?");
        moody.getMood();

    }

    public void observe(Moody moody){
        moody.expressFeelings();
        System.out.println(moody.toString());



    }



}
