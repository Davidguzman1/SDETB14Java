package class20;

public class MethodOverloadingDemo2 {
    static void F1(String name,int number){
        System.out.println(name+" "+number);
    }
    static void F1(String name,int number,int number2){
        System.out.println(name+" "+number+" "+number2);
    }
    static void F1(int num1,int number){
        System.out.println(num1+" "+number);
    }
    static void F1(int number,String name){
        System.out.println(number+" "+name);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo2 md=new MethodOverloadingDemo2();
        md.F1(20,"Hi");
        md.F1(20,20);
        md.F1("Naven",23);
        md.F1("Franl",23,24);
    }


}
