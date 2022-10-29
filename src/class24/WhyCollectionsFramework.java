package class24;

import java.util.ArrayList;
import java.util.Arrays;

public class WhyCollectionsFramework {
    public static void main(String[] args) {
        /*
        * If we have to store a single a value we should use variables
        *
        * */
        String name="Josh";
        String name2="Joe";
        /*
        if we have to store more than 2 values of same kind then we should deal with arrays
         */

        String[] names={"Rashad","Adam","Elaine","Paplino"};
        /*
        arrays are fixed in size
         */
        System.out.println(Arrays.toString(names));
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Green");
        colors.add("Red");

        System.out.println(colors);



    }
}
