package Assignment6Part1;
import java.text.*;
import java.util.*;

//Write Custom Sorting by implementing the following comparators
//1. NameComparator: Student objects should be sorted in ascending order by 'name'
//field of the object;
//2. GpaComparator: Student objects should be sorted in descending order by 'gpa'
//field of the object;
//3. DateOfBirthComparator: Student objects should be sorted in ascending order by
//'dateOfBirth' field of the object;
//Then in the main method, create a List of Student objects and print the list of
//objects 3 times with the following logic.
//1. Sort by ascending order of 'name'
//2. Sort by descending order of 'gpa'
//3. Sort by ascending order of 'dateOfBirth'

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = ft.parse("1992-10-26");
        Date date2 = ft.parse("1995-1-06");
        Date date3 = ft.parse("2001-11-08");

        Student student1 = new Student(1, "Lily", 4.0, date1 );
        Student student2 = new Student(1, "Judy", 3.8, date2 );
        Student student3 = new Student(1, "Alex", 2.6, date3 );
//        Student student4 = new Student(1, "Ashishi", 4.0, new Date(2020,10,03));

        List<Student> students = new LinkedList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        compareName(students);
        System.out.println("**************");
        compareGpa(students);
        System.out.println("**************");
        compareDateOfBirth(students);


    }
    public static void compareName(List<Student> students){
//        students.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student stu1, Student stu2) {
//                return stu1.getName().compareTo(stu2.getName());
//            }
//
//        });

        Collections.sort(students, (student1, student2)-> student1.getName().compareTo(student2.getName()));

        for (Student student: students){
            System.out.println(student.getName() + " Name: " +student.getName() );
        }



    }
    public static void compareGpa(List<Student> students){
//        students.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student stu1, Student stu2) {
//                return Double.compare(stu1.getGpa(),stu2.getGpa());
//            }
//        });

        Collections.sort(students, (student1, student2)-> Double.compare(student1.getGpa(),student2.getGpa()));
        for (Student student: students){
            System.out.println(student.getName() + " GPA: " +student.getGpa() );
        }

    }
    public static void compareDateOfBirth(List<Student> students){
//        students.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student stu1, Student stu2) {
//                return stu1.getDateOfBirth().compareTo(stu2.getDateOfBirth());
//            }
//
//        });

        Collections.sort(students, (student1, student2) -> student1.getDateOfBirth().compareTo(student2.getDateOfBirth()));
        for (Student student: students){
            System.out.println(student.getName() + " Date Of Birth: " +student.getDateOfBirth() );
        }

    }
}
