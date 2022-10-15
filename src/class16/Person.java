package class16;

public class Person {

    private String password="pass123";
   public double salary=1000;

    public static void main(String[] args) {
        Person person1=new Person();//creating class

        System.out.println(person1.password);
        System.out.println(person1.salary);

    }
}
