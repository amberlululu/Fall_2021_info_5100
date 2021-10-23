package Design.Multiton;

public class Main {
    public static void main(String[] args) {

        Projector proj1 = Projector.getProjector(1);
        Projector proj2 = Projector.getProjector(2);
    }
}
