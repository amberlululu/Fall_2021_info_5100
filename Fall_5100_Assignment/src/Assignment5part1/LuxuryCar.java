package Assignment5part1;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(ICar car) {
        super(car);
        this.name = "Luxury Car";
    }
}
