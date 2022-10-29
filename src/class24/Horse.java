package class24;

public class Horse {
    private String name;
    private String breed;
    private String color;
    private int age;
    private double weight;

    public Horse(String name, String breed, String color, int age, double weight) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setAge(age);
        setWeight(weight);
    }
    void printInfo(){
        System.out.println("Name: "+name+" Breed: "+breed+" Color: "+color+" Age: "+age+" Weight: "+weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("Name can't be empty");
        }else{
        this.name = name;
    }}

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(breed.isEmpty()){
            System.out.println("Breed can't be empty");
        }else {

            this.breed = breed;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()){
            System.out.println("You should provide a color");
        }else {
            this.color = color;
        }
        }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>30){
            System.out.println("Your age should be reasonable");
        }else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight>1000){
            System.out.println("Please make sure the weight you entered is correct");
        }else {
            this.weight = weight;
        }


    }
}
class HorseTest{
    public static void main(String[] args) {
        Horse tim=new Horse("Tim","Stallion","Red",12,500);
        tim.printInfo();





    }



}
