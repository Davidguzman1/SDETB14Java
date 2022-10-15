package class19;

public class Teacher {
    String name;
    String subject;
    int classNum;
    int age;
    int teachingExperience;

    public Teacher(String name,String subject, int classNum, int age, int teachingExperience) {
        this.name = name;
        this.subject=subject;
        this.classNum = classNum;
        this.age = age;
        this.teachingExperience = teachingExperience;
    }
   public void printInfo(){
        System.out.println("Name:"+name+" Age:"+age+" Teaching Experience:"+teachingExperience+" Subject:"+subject+" Classroom Number:"+classNum);
    }

}
class mathTeacher extends Teacher{


    public mathTeacher(String name, String subject, int classNum, int age, int teachingExperience) {
        super(name, subject, classNum, age, teachingExperience);
    }
}
class scienceTeacher extends Teacher{

    public scienceTeacher(String name, String subject, int classNum, int age, int teachingExperience) {
        super(name, subject, classNum, age, teachingExperience);
    }
}
class pianoTeacher extends Teacher{
    public pianoTeacher(String name, String subject, int classNum, int age, int teachingExperience) {
        super(name, subject, classNum, age, teachingExperience);
    }
}

class teacherTester{
    public static void main(String[] args) {
        mathTeacher ron=new mathTeacher("Ron","Math",212,36,12);
        ron.printInfo();
        scienceTeacher claire=new scienceTeacher("Claire","Science",113,26,2);
        claire.printInfo();
        pianoTeacher frank=new pianoTeacher("Frank","Piano",313,48,25);
        frank.printInfo();


    }
}

