package AnimalExercise;

public abstract class Pet {
    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColor() {
        return color;
    }

    private String name;
    private String ownerName;
    private String color;

    public Pet(String name, String ownerName, String color){
        this.name = name;
        this.ownerName = ownerName;
        this.color = color;

    }


    @Override
    public String toString(){
        return " this name " + this.name + " this ownerName "+this.ownerName +" this color " + this.color;
    }
    public abstract String eat();
    public abstract String sound();



}
