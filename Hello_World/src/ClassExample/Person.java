package ClassExample;

public class Person {
    private String firstName;
    private String lastName;
    private String SSN;

    public Person(String firstName, String lastName, String SSN){
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }
    // set firstname default value
    public Person( String lastName, String SSN){
        this.firstName = "Superman";
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return SSN;
    }
}
