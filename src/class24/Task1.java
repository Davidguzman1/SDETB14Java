package class24;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[]args){
        ArrayList<String> names=new ArrayList();
        names.add("David");
        names.add("Donald");
        names.add("Ron");
        names.add("Daria");
        names.add("Francesca");



        if(!(names.isEmpty())){
            System.out.println("The array lists has names inside of it");
        }
        if(names.contains("Ron")){
            System.out.println("Ron is in the list");
        }
        System.out.println("Array list size: "+names.size()+", Names inside: "+names);



    }
}
