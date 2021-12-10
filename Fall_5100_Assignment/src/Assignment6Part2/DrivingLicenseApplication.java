package Assignment6Part2;
import java.time.temporal.ChronoUnit;
import java.util.*;



//Write a class called 'DrivingLicenseApplication' to read input from the keyboard which
//take dateOfBirth of Date datatype. If the age is below 16 (For example 14), then throw
//and catch and exception which prints the message.
//The age of the applicant is 14 which is too early to apply for a driving license
public class DrivingLicenseApplication {

     private int birthYear;
     private int birthMon;
     private int birthDate;

    public DrivingLicenseApplication(int birthYear, int birthMon, int birthDate) {
        this.birthYear = birthYear;
        this.birthMon = birthMon;
        this.birthDate = birthDate;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getBirthMon() {
        return birthMon;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setBirthMon(int birthMon) {
        this.birthMon = birthMon;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public void getDateOfBirthFromUser(){

                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter your Birth Year");
//                int res1 = scanner.nextInt();
                String yearString = scanner.nextLine();
                int year = Integer.parseInt(yearString);
                setBirthYear(year);

                System.out.println("Please enter your Birth Month");
                String monthString = scanner.nextLine();
                int month = Integer.parseInt(monthString);
                setBirthMon(month);


                System.out.println("Please enter your Birth Date");
                String dayString = scanner.nextLine();
                int day = Integer.parseInt(dayString);
                setBirthDate(day);

    }
}
