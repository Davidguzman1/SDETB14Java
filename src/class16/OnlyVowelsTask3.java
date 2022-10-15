package class16;

public class OnlyVowelsTask3 {
    private static String onlyVowels(String a){

        return a.replaceAll("[^aeiouAEIOU]","");

    }

    public static void main(String[] args) {
        
        System.out.println(onlyVowels("Java Is Great"));
    }




}
