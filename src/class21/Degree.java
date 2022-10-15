package class21;

public class Degree {

    public void getPrerequisite(){
        System.out.println("To get a degree you need a high school diploma");
    }
}
class Bachelors extends Degree{
    @Override
    public void getPrerequisite(){
        System.out.println("To get a bachelors degree you need 120 credits ");
    }

}
class Masters extends Degree{

    @Override
    public void getPrerequisite() {
        System.out.println("To get a masters you need a bachelors degree");
    }
}
class DegreeTester{
    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite();

        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();

        Masters masters=new Masters();
        masters.getPrerequisite();
    }
}