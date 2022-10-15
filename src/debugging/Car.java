package debugging;


    public class Car{
        String make;
        String model;
        int numberOfDoors;
        int topSpeed;
        double price;

        Car(String make,String model,int numberOfDoors,int topSpeed,double price){
            this(make, model, topSpeed, price);
            this.numberOfDoors=numberOfDoors;
        }
        Car(String make,String model,int topSpeed,double price){
            this.make=make;
            this.model=model;
            this.topSpeed=topSpeed;
            this.price=price;
            if(this.numberOfDoors==0){
                this.numberOfDoors=4;
            }
        }
        Car(int numberOfDoors,int topSpeed,double price){
            this.topSpeed=topSpeed;
            this.numberOfDoors=numberOfDoors;
            this.price=price;
            if(this.make.isEmpty()){
                this.make="Unknown";
            }
            if(this.model.isEmpty()){
                this.model="Unknown";
            }
        }
        Car(String make,String model,int numberOfDoors){
            this.make=make;
            this.model=model;
            this.numberOfDoors=numberOfDoors;
            if(this.topSpeed==0){
                this.topSpeed=90;
            }
            if(this.price==0){
                this.price=0;
            }
        }
        public void displayInfo(){
            System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
        }
    }

class CarTester {
    public static void main(String[] args) {
        Car car=new Car("Toyota","Prius",4,120,30000);
        car.displayInfo();
        Car car1=new Car("Toyota","Prius",120,30000);
        car1.displayInfo();
        Car car2=new Car(4,120,30000);
        car2.displayInfo();
        Car car3=new Car("Toyota","Prius",4);
        car3.displayInfo();
    }

}



