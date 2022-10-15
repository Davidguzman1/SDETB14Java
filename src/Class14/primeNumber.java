package Class14;

public class primeNumber {
    void isPrime(int a){



int d=0;
        for(int i=2;i<a;i++) {
            if (a % i ==0){

                System.out.println(a +  " is not a prime number");
                d=1;
                break;
            }
        }
if(d==0){
    System.out.println(a+" is a prime number");
}

    }

    public static void main(String[] args) {
        primeNumber primeNum=new primeNumber();
        primeNum.isPrime(19);
    }
}
