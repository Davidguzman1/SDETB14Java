package class18;

public class Dog3 extends Animal {
    String color;
    double height;

    public Dog3(String name, String breed, String color, int age, double weight, double height) {
      /*  this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;*/
        this(name,breed,color,age,weight);

        this.height = height;
    }
    public Dog3(String name, String breed, String color, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;

    }
}
