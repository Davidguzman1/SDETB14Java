package class20;

public class Task3 {
    static void overloadedMethod(int num,int num2){
        System.out.println(num+num2);
    }
    static void overloadedMethod(String word){
        System.out.println(word);
    }
    static void overloadedMethod(int num){
        System.out.println(num*num);
    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        task3.overloadedMethod(2,3);
        task3.overloadedMethod("Hi");
        task3.overloadedMethod(4);
    }
}
