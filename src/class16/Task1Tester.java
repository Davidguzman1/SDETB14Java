package class16;

public class Task1Tester {


    public static void main(String[] args) {
        SyntaxEmployee asgharEmp =new SyntaxEmployee();
        asgharEmp.empId="123";
        asgharEmp.salary=10000;



        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee.CEO="Asel";
        SyntaxEmployee mozzamEmp =new SyntaxEmployee();
        mozzamEmp.empId="123";
        mozzamEmp.salary=10000;


        System.out.println(SyntaxEmployee.CEO);


    }
}
