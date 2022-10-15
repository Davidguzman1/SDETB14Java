package Class14;

public class MethodDemo1 {

    void printHello(){
        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hello Aladin");
    }
void printWord(String word){

    System.out.println(word);
}

    public static void main(String[] args) {

        MethodDemo1 obj=new MethodDemo1();

        obj.printHello();//This is defining the method
        obj.printWord("Came up");
        obj.printWord("What am I going to do today");



    }


}
