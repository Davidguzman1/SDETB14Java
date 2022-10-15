package class17;

public class ConstructerTask1Tester {

    public static void main(String[] args) {
        ConstructerTask1 cT=new ConstructerTask1("The word", 17 );
        cT.ConstructerNum();
        cT.ConstructerWord();
        ConstructerTask1 cT1=new ConstructerTask1();
        cT1.ConstructerWord();
        cT1.ConstructerNum();
    }
}


