package Assignment4;

import java.util.Random;

public class AddRemoveItemFromList implements Runnable{
    @Override
    public void run() {

        Random rand = new Random();

        while(true){
            int test = rand.nextInt(2);
            if(test >= 1){
                Main.threadSafe.addAtPosition(0, rand.nextInt(10));

            }else{
                Main.threadSafe.removeAtPosition(Main.threadSafe.size()-1);


                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
