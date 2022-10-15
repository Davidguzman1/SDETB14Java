package class16;

public class ReverseWordTask2 {
    public String reverseString(String a){
        String word="";

        for (int i = 0; i < a.length(); i++) {

            word=a.charAt(i)+word;

        }
        return word;

    }

}
