package class18;

public class Car{
    //Common class has many different names like parent class super class and base class
    String model;
    String make;

    int year;
    String color;
    int topSpeed;
    double price;
    //if a field or method has a private access modifier in parent class child classes can't use it


    private String engineType;

    void printCarDetails(){
        System.out.println("Model "+model+" Make "+make+" Color "+color);
    }
}

class BMW extends Car{

    double engineCC;

}
class Tesla extends Car{

}
class Toyota extends Car{

    double engineCC;
}
class carTester{
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.model="x5M";
        bmw.color="Blue";
        bmw.make="BMW";
        bmw.engineCC=200;
        bmw.printCarDetails();
    }
}
