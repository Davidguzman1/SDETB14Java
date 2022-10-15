package Class14;

public class email {
    void createEmail(String a,String b,String c){


        System.out.println(a.toLowerCase()+b.toLowerCase()+"@"+c.toLowerCase()+".com");

    }

    public static void main(String[] args) {


        email Email = new email();

        Email.createEmail("David", "Guzman", "Gmail");
    }


}
