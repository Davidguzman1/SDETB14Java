package class21;

public class Animal {
    void sleep(){
        System.out.println("Animals usually sleep for 6 hour");
    }
    void eat(){
        System.out.println("Grass and meat");
    }
}
class Cat extends Animal {
    String name;
    String color;
    String breed;

    void sleep() {
        System.out.println("I like to sleep for 28 hours");
    }
    void eat(){
        System.out.println("I only like fish");
    }

}
class Dog extends Animal{



    void sleep(){
        System.out.println("I like to sleep for 10 hours");
    }
    void eat(){
        System.out.println("Dogs like meat");
    }
}
