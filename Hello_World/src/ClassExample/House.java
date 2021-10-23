package ClassExample;

public class House {
    public int houseNumber;
    public String color;
    public int numberOfBedroom;
    public double numberOfBathroom;
    // inside the House class er can get access to the private property but outside no
    private boolean isSolid;
    public Person owner;

    // if delete the default constructor then we must have the customized one and once we initialize the instance we automatically use the customize one
    public House(){
        this.isSolid = false;
        System.out.println("this is the default constructor");
    }

    // this means everything inside this class.
    public House(int houseNumber, String color, int numberOfBedroom, double numberOfBathroom){
        this.houseNumber = houseNumber;
        this.color = color;
        this.numberOfBedroom = numberOfBedroom;
        this.numberOfBathroom = numberOfBedroom;
        this.isSolid = false;
        this.owner = new Person("Unknown","Unknown","123-456-7890");

    }


    public void printHouseInformation(){
        System.out.println("House number " + houseNumber);
        System.out.println("house color " + color);
        System.out.println("number of Bedrooms " + numberOfBedroom);
        System.out.println("number of bathroom " + numberOfBathroom);
    }
    // method overloading same name same return type but different input
    public void printHouseInformation(boolean printOwnerName){
        System.out.println("House number " + houseNumber);
        System.out.println("house color " + color);
        System.out.println("number of Bedrooms " + numberOfBedroom);
        System.out.println("number of bathroom " + numberOfBathroom);
        if(printOwnerName){
            System.out.println("owner is " + owner.getFirstName() +" "+ owner.getLastName());
        }
    }
}
