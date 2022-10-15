package class19;

public class Shape {
    double radius;
    Shape(double radius){

        this.radius=radius;
    }
}
class circle extends Shape{
    public circle(double radius) {

        super(radius);
    }
    public void printArea(){
        System.out.println((radius*radius)*Math.PI);
    }
}
class CircleTester{
    public static void main(String[] args) {
        circle Circle=new circle(23);

        Circle.printArea();


    }


}
