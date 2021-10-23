package Design.ThreadExample;

public class Main {
    public static void main(String[] args) {
        Person Ashishi = new Person("Ashishi");

        Ashishi.start();

        int counter = 15;

        while(true){
            System.out.println(" I am in main thread");
            try {
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            counter--;
        }


    }
}
