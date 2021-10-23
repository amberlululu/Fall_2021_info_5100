package AnimalExercise;

public class Cat extends Pet implements iBoardable{
    private int startDate;
    private int endDate;
//    public Cat(){
//        super(String "Cat Default", String "default ownerName", String "default color");
//    }

    public Cat(String name, String ownerName, String color) {
        super(name, ownerName, color);
    }



    @Override
    public String eat() {
        return this.getName() +"will eat tuna";
    }

    @Override
    public String sound() {
        return this.getName() + "will make a meau sound";
    }


    @Override
    public void setBoardStart(int startDate) {
        this.startDate = startDate;

    }

    @Override
    public void setBoardEnd(int endDate) {
        this.endDate = endDate;

    }

    @Override
    public boolean boarding(int day) {
        if(day >= startDate && day <= endDate){
            return true;
        }
        return false;
    }
}
