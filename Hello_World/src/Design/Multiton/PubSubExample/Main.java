package Design.Multiton.PubSubExample;

public class Main {
    public static void main(String[] args) {
        Publisher Ashishi = new Publisher("Ashishi","Infor 5100");
        Publisher Andre = new Publisher("Andre","Business Analytics");

        Student Mark = new Student("Mark",1);
        Student Alex = new Student("Alex",2);
        Student Lucy = new Student("Lucy",3);


        Mark.subscribe(Ashishi);
        Alex.subscribe(Ashishi);
        Lucy.subscribe(Ashishi);

        Ashishi.addGrade(1, "A");
        Ashishi.addGrade(2, "B");
        Ashishi.addGrade(3, "A-");

        Ashishi.notifyGrades();
        Alex.unsubscribe(Ashishi);
        Ashishi.notifyGrades();

//
        Mark.subscribe(Andre);
        Alex.subscribe(Andre);
        Lucy.subscribe(Andre);



        Andre.addGrade(1, "A-");
        Andre.addGrade(2, "A");
        Andre.addGrade(3, "C+");


        Lucy.unsubscribe(Andre);
        Andre.notifyGrades();




    }
}
