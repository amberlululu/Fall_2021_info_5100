package Design.Singleton;

public class Main {
    public static void main(String[] args) {
        Projector proj = Projector.get_instance();

        Projector proj1 = Projector.get_instance();
        proj.name = "project name";

        System.out.println(proj.name);
    }
}
