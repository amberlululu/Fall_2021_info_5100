package ClassAbstractExercise;

public class Main {
    public static void main(String[] args) {
        Phychiatrist phych = new Phychiatrist();
        Happy happy1 = new Happy("happy");
        Sad sad1 = new Sad("sad");
        phych.examine(happy1);
        phych.observe(happy1);
        phych.examine(sad1);
        phych.observe(sad1);

    }

}
