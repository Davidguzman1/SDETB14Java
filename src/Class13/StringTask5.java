package Class13;

import java.util.Scanner;

public class StringTask5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter a word");


        String str= scan.next();
        String str2="";

        for (int i = 0; i <str.length() ; i++) {

            str2=str.charAt(i)+str2;
        }
        if (str.equals(str2)){
            System.out.println("Your word is a palindrome");
        } else{
            System.out.println("Your word is not a palindrome");
        }



    }
}
