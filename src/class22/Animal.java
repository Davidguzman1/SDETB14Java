package class22;

public class Animal {
    void eat(){
        System.out.println("Animals usually eat plants");
    }
    void sleep(){
        System.out.println("Animals sleep for 8-10 hours");
    }

}
class Panda extends Animal{
    @Override
    void eat(){
        System.out.println("Pandas eat bamboos");
    }
    @Override
    void sleep(){
        System.out.println("Panda sleep for 14 hours");
    }
}
class Cat extends Animal{
    @Override
     void eat(){
        System.out.println("Cats like to eat");
    }

}