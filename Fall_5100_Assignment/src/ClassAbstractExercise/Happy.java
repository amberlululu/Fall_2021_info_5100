package ClassAbstractExercise;

public class Happy extends Moody{
    public Happy(String moodyType){
        super(moodyType);

    }


    @Override
    public String getMood() {
        return "I am Happy";
    }

    @Override
    public String toString(){
        return "Subject laughs a lot";
    }

    @Override
    public void expressFeelings(){
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }



}
