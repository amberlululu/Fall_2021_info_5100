package ClassExample;

public class Main {
    public static void main(String[] args) {
        House blackHouse = new House();
        blackHouse.houseNumber =100;
        blackHouse.color = "black";

        House greenHouse = blackHouse;
        greenHouse.houseNumber  = 200;
        greenHouse.color = "Green";
        System.out.println("house number is " + greenHouse.houseNumber);
        System.out.println("house color is" + greenHouse.color);


        House H1 = new House(150, "red",2,2.5);
        House H2 = new House(299, "pink",1,1.5);

        House H3 = new House(300, "blue",3,0.5);

        //not accessible
//        System.out.println(whiteHouse.isSolid);
        System.out.println(H3);


        Person p1 = new Person("Lu","Bai","1635374646");
        System.out.println(p1.getFirstName());
        System.out.println(p1.getLastName());
        System.out.println(p1.getSSN());

        House[] houses = {H1, H2, H3};

        for(House house : houses){
            house.printHouseInformation();
        }

        H3.printHouseInformation(true);






    }

//    static void createHouses(){
//        House house1 = new House();
//        house1.houseNumber =100;
//        house1.color = "black";
//        System.out.println("house number is " + house1.houseNumber);
//        System.out.println("house color is" + house1.color);
//
//    }
    static void printOwnerName(House house){
        System.out.println("Owner" + house.owner.getFirstName() + house.owner.getLastName());
    }


}
