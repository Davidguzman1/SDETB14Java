package Class14;

public class StringBufferVsBuilder {
    public static void main(String[] args) {

        //mostly used class newer and better
        StringBuilder stringBuilder=new StringBuilder("Today is java class");
        //older one slow and not used alot
        StringBuffer stringBuffer=new StringBuffer("Today is java class");

        String str="Java is easy";
        StringBuilder stringBuilder1=new StringBuilder(str);
        System.out.println("stringBuilder1 = " + stringBuilder1);

String newstr=stringBuilder1.toString();
    }
}
