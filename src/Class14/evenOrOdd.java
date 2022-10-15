package Class14;

public class evenOrOdd {
    void isEvenOrOdd(int a){
        if (a % 2 == 0) {

            System.out.println(a+" is even");
        }else {
            System.out.println(a + " is odd");
        }
    }

    public static void main(String[] args) {
        evenOrOdd eoo=new evenOrOdd();

        eoo.isEvenOrOdd(12);



    }


}
