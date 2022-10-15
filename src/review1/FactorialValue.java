package review1;

import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number");
       int a= scan.nextInt();
int sum=a;

        for (int i = a-1; i < a; i--) {
            sum=a*i*sum;
            if(i==1){
                break;
            }
        }
        System.out.println(sum);

    }
}
