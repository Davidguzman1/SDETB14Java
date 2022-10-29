package Project2;

public abstract class Marks {
    abstract double getPercantage();
}
class StudentA extends Marks{
    private double sub1;
    private double sub2;
    private double sub3;

    public StudentA(double sub1, double sub2, double sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    double getPercantage() {
        return (sub1+sub2+sub3)/3;
    }
}
class StudentB extends Marks{
private double sub1;
private double sub2;
private double sub3;
private double sub4;

    public StudentB(double sub1, double sub2, double sub3, double sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    @Override
    double getPercantage() {
        return (sub1+sub2+sub3+sub4)/4;
    }
}
class StudentTester{
    public static void main(String[] args) {
        Marks[] mark={new StudentA(78.8,88,84.3),new StudentB(83,89.3,95.3,99.8)};

    for(Marks mark1:mark) {
        System.out.println(mark1.getPercantage());
    }

}}