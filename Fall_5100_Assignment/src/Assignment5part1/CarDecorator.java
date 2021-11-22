package Assignment5part1;

public class CarDecorator extends ICar{
    protected ICar baseCar = null;
    protected  String name = "Decorator";

    public CarDecorator(ICar car){
        baseCar = car;
    }


    @Override
    public void assemble() {
        baseCar.assemble();
        System.out.println("Adding features of " + name);

    }
}
