package review1;

public class ForLoopPractice {
    public static void main(String[] args) {
        double a=99.98;
        double finder=0;
        for(double i=1; i<a;i+=0.01){
            if(a%i==0){
finder=a%i+finder;
                System.out.println(a%i);
                break;
            }
        }
        System.out.println(finder);




    }
}
