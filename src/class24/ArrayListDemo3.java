package class24;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args){


        ArrayList<Character> chars=new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('Z');
        chars.add('G');
        System.out.println(chars);
        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        System.out.println(booleans);

        ArrayList<Float> floats=new ArrayList<>();
        floats.add(340f);
        floats.add(30f);
        floats.add(34f);
        floats.add(240f);
        floats.add(330f);
        System.out.println(floats);
    }
}
