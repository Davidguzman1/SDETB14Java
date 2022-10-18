package class23;

public abstract class Animal {
    abstract void eat();
    abstract void sleep();

    public static void main(String[] args) {

    }
}
class Cat extends Animal{
    @Override
    void eat(){
        System.out.println("Cats eat fish");
    }
    void sleep(){
        System.out.println("Cats like to sleep 12-16 hours");
    }


}
class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Dogs like meat");
    }
    void sleep(){
        System.out.println("Dogs sleep 8-9 hours");
    }


}