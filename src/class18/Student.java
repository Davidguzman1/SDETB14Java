package class18;

public class Student {
    private String name;
    private String address;
    private String school;
    private int age;


    public Student(java.lang.String name, java.lang.String address, java.lang.String school, int age) {
        this.name = name;
        this.address = address;
        this.school = school;
        this.age = age;
    }
    void displayInfo(){
        System.out.println("Name:"+name+" Address:"+address+" Age:"+age+" School:"+school);
    }
    public static void main(String[]args){
        Student david=new Student("David","123 strret","Syntax Tech",19);

        david.displayInfo();

    }
}
