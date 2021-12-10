package Assignment6Part2;

import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        DrivingLicenseApplication appl1 = new DrivingLicenseApplication(1992,10,11);

        int difference = 0;

        try{
            appl1.getDateOfBirthFromUser();
            Date dateNow = new Date();
            Date date = new GregorianCalendar(appl1.getBirthYear(), appl1.getBirthMon()-1, appl1.getBirthDate()).getTime();
            difference = (int) ChronoUnit.DAYS.between(date.toInstant(), dateNow.toInstant());


        }catch(Exception ex){
            System.out.println(ex.getLocalizedMessage());
        }finally{
            if(difference < 365*16){
                System.out.println("User is below 16, you are too early to apply for a driving license");
            }else{
                System.out.println("you are proved to apply for a driving license ");
            }
        }


    }
}
