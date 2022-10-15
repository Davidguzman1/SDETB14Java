package Class14;

public class student {
    void getGrade(int a){

        if(a>=90){
            System.out.println("A");
        } else if (a>=80&&a<=89){
            System.out.println("B");
        } else if (a>=70&&a<=79){
            System.out.println("C");
        } else if (a>=50&&a<=69){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }

    public static void main(String[] args) {
        student studentGrades=new student();
        studentGrades.getGrade(91);
    }
}
