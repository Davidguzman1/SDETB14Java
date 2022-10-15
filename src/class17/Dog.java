package class17;

public class Dog {
    private String name;
    private String breed;
    private String color;
    private int age;
    private double weight;



    void printInfo() {
        System.out.println("name:" + name + " " + "breed:" + breed + " age: " + age);
    }

    Dog(String dogName,String dogBreed,String dogColor,int dogAge, double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        if(dogAge>30){
            System.out.println("Please enter a valid value");
        }else{
        age=dogAge;}
        weight=dogWeight;
    }


    public static void main(String[] args) {
/*Dog dog=new Dog();

dog.name="Tony";
dog.breed="Huskey";
dog.color="Pink";
dog.age=10;
dog.weight=30;
dog.printInfo();*/
        Dog dog=new Dog("Tony","Husky","Pink",10,30);
        dog.printInfo();

        Dog dog2=new Dog("Carl","German","Green",13,30);
        dog2.printInfo();

        /*dog2.name="Carl";
        dog2.breed="German";
        dog2.color="Green";
        dog2.age=12;
        dog2.weight=30;
        dog2.printInfo();*/


    }
}