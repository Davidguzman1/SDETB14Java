package review1;

public class StringMethods {
    public static void main(String[] args) {
        String str="hello";
        //toUpperCase or toLowerCase

       str.toUpperCase();

        System.out.println(str);
        System.out.println("----------------------");
str=str.toUpperCase();
        System.out.println(str);
//length(); gives size
        int size=str.length();
        System.out.println(size);
        //charAt() it returns a char value
       char letter= str.charAt(0);
        System.out.println(letter);
        //how to get last char
     char lastChar=str.charAt(str.length()-1);
        System.out.println(lastChar);

        // indexOf
       int indLastChar= str.indexOf('a');

        System.out.println(indLastChar);

        //isEmpty()
        boolean isTrue=str.isEmpty();
        System.out.println(isTrue);

        //trim()

    }
}
