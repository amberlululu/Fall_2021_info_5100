package AnimalExercise;

public class Main {

    public static void main(String[] args) {
        Cat Tom  = new Cat("Tom","Amber","Orange");
        Dog Ted = new Dog("Ted", "Dennis", "Brown", "small");
        System.out.println(Tom.toString());
        System.out.println(Ted.toString());
        Tom.setBoardStart(1);
        Tom.setBoardEnd(5);
        System.out.println(Tom.boarding(3));


    }


}
