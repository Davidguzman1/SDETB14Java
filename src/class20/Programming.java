package class20;

public class Programming {

    static void programLanguage(String language){
        System.out.println("I love "+language);
    }
    static void programLanguage(){
        System.out.println("I love programming languages");
    }

    public static void main(String[] args) {
        Programming pLanguage=new Programming();
        pLanguage.programLanguage();
        pLanguage.programLanguage("Java");
    }
}
