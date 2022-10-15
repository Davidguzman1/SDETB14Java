package class20;

public class Task4 {
    private void overloadedMethod(String word,int num){
        System.out.println(word+" "+num);
    }
    private void overloadedMethod(int num,String word){
        System.out.println(num+" "+word);
    }
    private void overloadedMethod(int num){
        System.out.println(num);
    }

    public static void main(String[] args) {
        Task4 task4=new Task4();
        task4.overloadedMethod(5);
        task4.overloadedMethod("hi",5);
        task4.overloadedMethod(6,"Hi");
    }
}
