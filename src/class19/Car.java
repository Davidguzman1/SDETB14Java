package class19;
class vehicle {
int noOfWheels;
int topSpeed;
public void printTopSpeed(){
    System.out.println(topSpeed);
}
}

public class Car extends vehicle{//multi level inheratance}{
    String model;
    String make;
    int year;
}
class Tesla extends Car{//This is single inheritance
    void printInfo(){
        System.out.println("I am a electrical car");
    }
}
class Toyota extends Car{//Hierachel inheratance
    void printInfo(){
        System.out.println("I am a electrical car");
    }
}
/*class CustomCar extends Toyota,Tesla{
    not allowed because of diamond problem
}*/
class tester{
    public static void main(String[] args) {
        Toyota toyta=new Toyota();
        toyta.printTopSpeed();
    }
}