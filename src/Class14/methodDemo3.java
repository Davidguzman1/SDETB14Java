package Class14;

public class methodDemo3 {

    boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        methodDemo3 obj=new methodDemo3();

        if(obj.isEven(4)){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }



    }
}
