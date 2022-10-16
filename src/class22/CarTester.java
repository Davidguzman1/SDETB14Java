package class22;

public class CarTester {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.start();
        bmw.stop();
        System.out.println("***********************");
        Toyota toyota=new Toyota();
        toyota.start();
        System.out.println("************************");
        Tesla tesla=new Tesla();
        tesla.park();
        tesla.stop();
        tesla.start();

    }
}
