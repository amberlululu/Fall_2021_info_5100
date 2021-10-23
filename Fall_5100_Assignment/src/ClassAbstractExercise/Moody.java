package ClassAbstractExercise;

public abstract class Moody {
    String moddyType;

    public Moody(String moddyType){
        this.moddyType = moddyType;

    }

    public abstract String getMood();

    public abstract void expressFeelings();

    public void queryMood(){
        System.out.println("I feel Happy(or Sad) today!!");

    }


}
