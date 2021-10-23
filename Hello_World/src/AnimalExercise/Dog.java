package AnimalExercise;

public class Dog extends Pet implements iBoardable{
    private String size;
    private int startDate;
    private int endDate;

    public Dog(String name, String ownerName, String color, String size) {
        super(name, ownerName, color);
        this.size = size;
    }

    @Override
    public String eat() {
        return this.getName() + "will eat meat";
    }

    @Override
    public String sound() {
        return this.getName() + " will make a sound";
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
