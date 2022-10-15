package Class14;

public class largerNumber {
    void whichIsLarger(int a,int b){
        if(a>b){
            System.out.println(a+" larger");
        }else if(a==b){
            System.out.println("Both numbers are equal to each other");
        }else{
            System.out.println(b+" is larger");
        }


    }

    public static void main(String[] args) {
        largerNumber lNum=new largerNumber();

        lNum.whichIsLarger(8,15);

    }
}
