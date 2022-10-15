package class15;

public class Dog1 {
    String name;//instance-it is inside a class
    static int noOflegs=4;//static var
    String color;
    void bark(){
        int i=10;//local var
        for (int j = 0; j <i ; j++) {
            //int j is also local
            System.out.println("Barking.....");
        }
    }

    public static void main(String[] args) {
        Dog1 dog=new Dog1(); //dog:Dog0733

        dog.bark();//dog:0733
        Dog1 dog1=new Dog1();
        dog1.bark();
    }

    void printInfo(){
        System.out.println("name "+name+" color "+color);

    }
    void printName(){
        System.out.println("name "+name);
    }
}
