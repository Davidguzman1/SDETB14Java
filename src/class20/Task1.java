package class20;

public class Task1 {
    public static void main(String[] args) {
        CalculateArea area=new CalculateArea();
        area.calculateArea(12,14);
        area.calculateArea(9.4,4.2);
        area.calculateArea(7);

    }
}
 class CalculateArea{
    static void calculateArea(int num,int num2){
        System.out.println(num*num2);
    }
    static void calculateArea(double num,double num2){
        System.out.println(num*num2);
    }
     static void calculateArea(int num){
        System.out.println(6*(num*num));
    }


}
