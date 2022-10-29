package class24;

import java.util.ArrayList;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //ArrayListDemo<int> number=new ArrayList<>(); cannot collect primative data types
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(34);
        numbers.add(44);

        for(Integer num:numbers){
            System.out.println(num);
        }


    }
}
