
package ClassAbstractExercise;
public class Sad extends Moody {
    public Sad(String moddyType){
        super(moddyType);

    }

    @Override
    public String getMood() {
        return "I am Sad";
    }

    @Override
    public String toString(){
        return "Subject cries a lot";
    }

    @Override
    public void expressFeelings(){
        System.out.println("'waah’  ‘boo hoo’  ‘weep’ ‘sob’");
    }





}
