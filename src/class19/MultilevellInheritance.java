package class19;

public class MultilevellInheritance {
    public void printStatemnt(){
        System.out.println("This is multilevel inheritance");
    }
}
class B extends MultilevellInheritance{



}
class C extends B{
    public static void main(String[] args) {
        C satement=new C();

        satement.printStatemnt();


    }


}
