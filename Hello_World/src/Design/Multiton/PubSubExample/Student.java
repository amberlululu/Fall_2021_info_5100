package Design.Multiton.PubSubExample;

public class Student {
    Integer studentID;
    String name;

    public Integer getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public Student(String name, Integer studentID){
        this.name = name;
        this.studentID = studentID;
    }


    public void getGrades(Publisher publisher, String classname, String grade){
        System.out.println(publisher.getName() + " has published grades for class "+ classname);
        System.out.println("your grade in class" + classname + "is " + grade);
    }

    public void subscribe(Publisher publisher){
        publisher.addSubscriber(this);

    }

    public void unsubscribe(Publisher publisher){
        publisher.removeSubscriber(this);

    }


}
