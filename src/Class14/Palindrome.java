package Class14;

public class Palindrome {
    void isPalindrome(String str){

        String str2="";

        for (int i = 0; i <str.length() ; i++) {

            str2=str.charAt(i)+str2;
        }
        if (str.equals(str2)){
            System.out.println(str+" is a palindrome");
        } else{
            System.out.println(str+" is not a palindrome");
        }
    }

    public static void main(String[] args) {
        Palindrome p=new Palindrome();

        p.isPalindrome("racecar");
    }


}
