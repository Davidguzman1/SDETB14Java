package Class14;
public class hello {

    void sayHello(String str){
        if(str.equals("USA")){
            System.out.println("Hello");
        }else if(str.equals("Honduras")){
            System.out.println("Hola");
        }else if(str.equals("France")){
            System.out.println("Bonjour");
        }else if(str.equals("Italy")) {
            System.out.println("Ciao");
        }


    }

    public static void main(String[] args) {


        hello cHello = new hello();

        cHello.sayHello("France");

    }
}

