package class20;



public class InheritanceEx {
    public static void main(String[]args){
        //C c=new C();--will print A B C
        Bn b=new Bn();



    }
}
class An{
    An(){
        System.out.println("A");
    }
}
class Bn extends An{
    Bn(){
        System.out.println("B");
    }

}
class C extends Bn {
    C() {
        System.out.println("C");
    }
}
