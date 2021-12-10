package Assignment6Part1;
import java.util.*;

public class Student {
    private final int id;
    private final String name;
    private final double gpa;
    private final Date dateOfBirth;

    public Student(int id, String name, double gpa, Date dateOfBirth){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}



