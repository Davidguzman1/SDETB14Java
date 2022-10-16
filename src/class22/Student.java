package class22;

public class Student {

    void willStudy(){
        System.out.println("I will study");
    }
    void sleep(){
        System.out.println("I get 9 hours of sleep");
    }
}
class SyntaxStudent extends Student{
    @Override
    void willStudy(){
        System.out.println("Syntax students will Study Java");
    }
    @Override
    void sleep(){
        System.out.println("Syntax students get 3 hours of sleep");
    }
    void programLanguage(){
        System.out.println("Syntax students use Java a s a program language");
    }
}
class SchoolStudent extends Student{
    @Override
    void sleep(){
        System.out.println("A school students get 6 hours of sleep");
    }
    void dorm(){
        System.out.println("school students sleep in the dorms");
    }
}
class StudentTester{
    public static void main(String[] args) {
        Student[] students={new SyntaxStudent(),new SchoolStudent()};
        for(Student student:students){
            student.sleep();
            student.willStudy();
        }


    }

}
