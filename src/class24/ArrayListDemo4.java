package class24;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Tyson");
        names.add("Ryan");
        names.add("TJ");
        names.add("Ryo");
        names.add(0,"Randy" );
        System.out.println(names);

        ArrayList<Integer> ints=new ArrayList<>();
        ints.add(43);
        ints.add(3);
        ints.add(33);
        ints.add(1,23);
        ints.set(0,12000);
        System.out.println(ints);

    }
}
