package class17;

public class ConstructerTask1 {
    private String word;
    private int num;

    ConstructerTask1(String conWord,int conNum){
        word=conWord;
        num=conNum;
    }
    ConstructerTask1(){

    }
    void ConstructerWord(){
        System.out.println(word);
    }
    void ConstructerNum(){
        System.out.println(num);
    }

}
