package Project2;

public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}
class Square implements Shape{
private double s1;


    public Square(double s1 ){
        this.s1 = s1;
    }

    @Override
    public void calculateArea() {
        System.out.println(Math.pow(s1,2));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(s1*4);
    }
}
class Circle implements Shape{
private double r;
Circle(double r){
    this.r=r;
}
    @Override
    public void calculateArea() {
        System.out.println(Math.PI*Math.pow(r,2));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(2*(Math.PI*r));
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Shape[] shape={new Square(8),new Circle(6)};
        for(Shape shape1:shape){
            shape1.calculateArea();
            shape1.calculatePerimeter();
        }


    }


}