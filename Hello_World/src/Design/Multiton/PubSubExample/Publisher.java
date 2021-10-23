package Design.Multiton.PubSubExample;
import java.util.*;

public class Publisher {

    private ArrayList<Student> students;
    private HashMap<Integer, String> grades;

    private String name;
    private String className;

    public Publisher(String name, String className){
        students = new ArrayList<>();
        grades = new HashMap<>();
        this.name  = name;
        this.className = className;

    }

    public String getName() {
        return name;
    }

    public void notifyGrades(){
        for(Student student : students){
            student.getGrades(this, this.className,grades.get(student.getStudentID()));
        }

    }

    public void addGrade(Integer studentID, String grade){
        if(!grades.containsKey(studentID)){
            grades.put(studentID, grade);
        }
    }

    public void addSubscriber(Student student){
        if(!students.contains(student)){
            students.add(student);
        }
    }

    public void removeSubscriber(Student student){
        if(students.contains(student)){
            students.remove(student);
        }
    }

}
