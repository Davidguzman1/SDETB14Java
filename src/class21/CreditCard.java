package class21;

public class CreditCard {
    static protected double interest=3;
    protected double balance;


    CreditCard(double balance){
        this.balance=balance;
    }
    void calculateInterest(){
        System.out.println((interest/100)/12*balance);
    }
}
class Visa extends CreditCard{
    public Visa(double balance) {
        super(balance);
    }
}
class AX extends CreditCard{
    static protected double interest=6;
    public AX(double balance) {
        super(balance);
    }
    @Override
    void calculateInterest(){
        System.out.println((interest/100)/12*balance);
    }
}
class CreditCardTester{
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(3998.21);
        creditCard.calculateInterest();

        Visa visa=new Visa(8939.98);
        visa.calculateInterest();

        AX ax=new AX(3998.21);
        ax.calculateInterest();
    }
}

