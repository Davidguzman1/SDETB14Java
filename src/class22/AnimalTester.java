package class22;

public class AnimalTester {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.sleep();
        cat.eat();

        Animal animal=new Panda();//Upcasting
        animal.eat();
        //Panda panda=new Animal(); doesn't work-down casting
        Animal animal1=new Cat();
        Animal[] animals={new Cat(),new Panda()};

    }
}
