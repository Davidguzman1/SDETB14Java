package Class13;

public class StringTask4 {
    public static void main(String[] args) {
        String str="This is a sentence in reverse";

        String[] str2=str.split(" ");


        for (int i=0;i<str2.length;i++) {
            StringBuilder str1 = new StringBuilder(str2[i]);


            System.out.print(str1.reverse() + " ");


        }




    }
}
