package Class13;

public class StringTask6 {
    public static void main(String[] args) {

        String str="Hi";
        String str2="Bye";

        System.out.println("str: "+str+" str2: "+str2);



        str=str+str2;
        str2=str.substring(0, str.length()-str2.length());
        str=str.substring(str2.length());

        System.out.println("str: "+str+" str2: "+str2);


    }
}
