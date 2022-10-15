package class17;

public class Person2 {
    String name;
    String color;
    String country;
    int age;
    double weight;
    String hairColor;
    String eyeColor;
    double height;
    char gender;

public Person2(){

}
public Person2(String perName){
    name=perName;
}
    public Person2(String name, String color, String country, int age, double weight, String hairColor, String eyeColor, double height, char gender) {
        this.name = name;
        this.color = color;
        this.country = country;
        this.age = age;
        this.weight = weight;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.height = height;
        this.gender = gender;
    }

    public static void main(String[] args) {
        Person2 person=new Person2("Asma");

}
}
