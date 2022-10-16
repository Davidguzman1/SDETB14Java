package class22;

public class Car {
    void start(){
        System.out.println("Use the key to start me");
    }
    void stop(){
        System.out.println("Use bakes to stop");
    }
    void park(){
        System.out.println("Park me manually");
    }
}
class BMW extends Car{
    @Override
    void start(){
        System.out.println("Use Push start to start me");
    }
    @Override
    void stop(){
        super.stop();
        System.out.println("You can also ise auto-breaking to stop me");
    }
}
class Toyota extends Car{
    @Override
    void start(){
        System.out.println("Push me to start");
    }

}
class Tesla extends Car{
    @Override
    void start(){
        System.out.println("Use the app to start");
    }
    @Override
    void stop(){
        System.out.println("Use AI and autobreaking o stop me");
    }
    @Override
    void park(){
        System.out.println("I can auto park myself");
    }



}
