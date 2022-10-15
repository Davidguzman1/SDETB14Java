package class16;

public class Student {
    /*
    Create a class called students
    Create three variables Name Id numofStudents
    Create three objects
    Set the value  for student name student id and increment the num of students
    for each object
    print out tot num of students
     */
String name;
String id;
static int numberOfStudents;

    public static void main(String[] args) {
        Student roman=new Student();
        roman.name="Roman";
        roman.id="1";
        Student.numberOfStudents++;

        Student sonanKapor=new Student();
        sonanKapor.name="Sonan";
        sonanKapor.id="2";
        Student.numberOfStudents++;

        System.out.println(Student.numberOfStudents);
    }
}
