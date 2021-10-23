package Inheritance;

public class Rhino extends  Animal  {


    public Rhino(String name, int age, double weight, boolean isMammal, boolean isVegetarian) {
        super(name, age, weight, isMammal, isVegetarian);
        type = AnimalType.mammal;
    }

    // overwrite the default functionality in Animal class
    public void eat(){
        // run the parent eat function first
//        super.eat();
        System.out.println("I am a Rhino, give me leafy vegetables to eat");
    }

    // overwrite the breath function in the animal class
    public void breathe(){
        System.out.println("I am super cool");
    }

}
