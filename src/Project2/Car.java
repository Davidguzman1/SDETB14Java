package Project2;

public class Car {
    protected double carPrice;
    protected String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    double calculateSalePrice(){
return carPrice;
    }

}
class Sedan extends Car{
    private int length;

    public Sedan(double carPrice, String color, int length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if(!(length>20)){
            return Math.abs(carPrice-(carPrice*.10));
        }else{
            return Math.abs(carPrice-(carPrice*.05));
        }
    }
}
class Truck extends Car{
    private double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if(!(weight>2000)){
            return Math.abs(carPrice-(carPrice*.20));
        }else{
            return Math.abs(carPrice-(carPrice*.10));
        }
    }
}
class CarTester{
    public static void main(String[] args) {
        Sedan sedan=new Sedan(10000,"Red",21);
        System.out.println(sedan.calculateSalePrice());

        Truck truck=new Truck(22000,"White",11000);
        System.out.println(truck.calculateSalePrice());

    }

}