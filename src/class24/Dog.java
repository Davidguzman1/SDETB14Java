package class24;

public class Dog {
   private String name;
   private String breed;
   private int age;
   private double weight;

    public Dog(String name, String breed, int age, double weight) {
      setName(name);
      setBreed(breed);
      setAge(age);
      setWeight(weight);

    }
    void setAge(int age){
        if(age>20){
            System.out.println("Please use less age something seems wrong here");
        }else if(age<0){
            System.out.println("Age can't be negative");
        }else{
            this.age=age;
        }
    }
    void setWeight(double weight){
        if(weight>300){
            System.out.println("Something seems wrong. Please try again");
        }else if(weight<0){
            System.out.println("The weight can't be less than 0. Please try again");
        }else{
            this.weight=weight;
        }
    }
    void setName(String name){
        if(name.length()>30){
            System.out.println("Name cannot be more than 30 letters. Please try again");
        }else if(name.isEmpty()){
            System.out.println("Name cannot be empty. Please try again");
        }else{
            this.name = name;
        }
    }
    void setBreed(String breed){
        if(breed.length()>30){
            System.out.println("Breed can not be more than 30 letters. Please try again");
        }else if(breed.isEmpty()){
            System.out.println("Breed can not be empty. Please try again");
        }else{
            this.breed = breed;
        }

    }
    void printInfo(){
        System.out.println("Name "+name+ " Breed "+breed+" Age "+age+" Weight "+weight);
    }
    String getName(){
        return name;
    }
    String getBreed(){
        return breed;
    }
    int getAge(){
        return age;
    }
    double getWeight(){
        return weight;
    }

}
class Test{
    public static void main(String[] args) {
        Dog tommy=new Dog("Tommy","German",19,45.8);

        System.out.println(tommy.getName());

        tommy.printInfo();



    }
}
