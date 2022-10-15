package class16;

public class PersonTester {


    public static void main(String[] args) {
        Person person=new Person();

        //System.out.println(person.password); since its private in another class it can't be accessed
        System.out.println(person.salary);//they exist inside the same package and it's a default access
    }
}
