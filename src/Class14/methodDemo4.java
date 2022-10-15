package Class14;

public class methodDemo4 {
    boolean mystery(){

        return false;
    }
    String mystery2(int a){
        return "Java";
    }
    String method(String word){
        //return"Java";
        if(word.equals("Java")){
            return "python";
        }else{
            return "Java";
        }
    }

    public static void main(String[] args) {
        methodDemo4 meth=new methodDemo4();

        System.out.println(meth.mystery());
        System.out.println(meth.mystery2(3));
        System.out.println(meth.method("Pump"));

    }
}
