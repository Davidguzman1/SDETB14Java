package class21;

public class Parent {



    void getMarry(){
        System.out.println("You will the marry the girl that we will select for you");
    }
}
class Zam extends Parent{
    @Override
    void getMarry(){
        System.out.println("I want marry taylor swift");
    }
}
class Test1{
    public static void main(String[] args) {
        Zam zam=new Zam();
        zam.getMarry();
    }
}