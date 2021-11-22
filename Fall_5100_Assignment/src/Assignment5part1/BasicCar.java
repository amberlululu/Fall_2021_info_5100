package Assignment5part1;

public class BasicCar extends ICar{
    private String name = "Basic Car";
    @Override
    public void assemble() {
        System.out.println(name);
    }
}
