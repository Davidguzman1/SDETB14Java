package class17;

public class ConstructerLevelaccess {
    private String name;
    private int batchNum;
    private double height;
    private boolean isTired;
    private char gender;
    private String statement;

    ConstructerLevelaccess(){
    }
    ConstructerLevelaccess(String myName){
        name=myName;
    }
    void m4(){
        System.out.println(name+" is doing great");
    }




    private ConstructerLevelaccess(String myName,boolean iAmTired){
        if(iAmTired){
            statement="I am tired";
        }else{
            statement="I am not tired";
        }
        name=myName;
    }
    void m2(){
        System.out.println(name+":"+statement);
    }
    protected ConstructerLevelaccess(String myName, double myHeight, char myGender){
        name=myName;
        height=myHeight;
        gender=myGender;
    }
    void m3(){
        System.out.println("Name:"+name+" Height:"+height+" Gender:"+gender);
    }

    public static void main(String[] args) {
        ConstructerLevelaccess inTheSameClass= new ConstructerLevelaccess("David",true);
        inTheSameClass.m2();


    }


}
