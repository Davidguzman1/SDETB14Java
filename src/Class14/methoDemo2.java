package Class14;

public class methoDemo2 {
    void printManyTimes(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("Hello Java");
        }
    }
    void printCustomWordManyTimes(String word,int times){
        for (int i = 0; i <times ; i++) {
            System.out.println(word);
        }
    }


    public static void main(String[] args) {
        methoDemo2 nd=new methoDemo2();
        nd.printManyTimes(2);

        nd.printCustomWordManyTimes("Placebo", 3);


    }

}
