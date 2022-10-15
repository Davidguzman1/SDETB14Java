package Class14;

public class math {
    void add(int a, int b){

        System.out.println(a+b);


    }
    void fibSeries(int num) {

        int pre = 0;
        int curN = 1;
        int nexN = 0;
        System.out.println(pre);
        System.out.println(curN);

        for (int i = 0; i < num; i++) {


            nexN = pre + curN;
            System.out.println(nexN);
            pre = curN;
            curN = nexN;
        }


    }
    public static void main(String[]args){
        math obj=new math();


obj.add(10,20);



    }
}


