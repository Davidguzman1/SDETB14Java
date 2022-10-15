package class17;

public class ConstructoPublicAccess {
    private String name;
    private int batchNum;
    public ConstructoPublicAccess(String myName,int myBatchNum){
        name=myName;
        batchNum=myBatchNum;
    }
    public void m1(){
        System.out.println(name+" is in batch "+batchNum);
    }
}
