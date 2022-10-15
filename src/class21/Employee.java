package class21;

public class Employee {
double baseSalary=40000;
double bonus=20000;


    void calculateSalary(){
        System.out.println(baseSalary+bonus);
    }

}
class Developer extends Employee{

    void calculateSalary(){
        System.out.println(2*baseSalary+(1.5*bonus));
    }
    void test(){
       super.calculateSalary();
       calculateSalary();
    }

}
class Tester extends Employee{
    void calculateSalary(){
        System.out.println(baseSalary+(2*bonus));
    }
}
class OfficeBoy extends Employee{

}
class Test{
    public static void main(String[] args) {
        Developer developer=new Developer();
        developer.calculateSalary();

    }
}


