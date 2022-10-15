package class17;

public class Students {
    private String name;
    private double scienceGrade;
    private double mathGrade;
    private double historyGrade;
    private double studentAverage;

    Students(){

    }

    Students(String studentName, double studentScienceG, double studentMathG, double studentHistoryG){
        name=studentName;
        scienceGrade=studentScienceG;
        mathGrade=studentMathG;
        historyGrade=studentHistoryG;
    }

    void averageGrade(){
        studentAverage=(scienceGrade+mathGrade+historyGrade)/3;

        System.out.println(name+" Average Grade: "+studentAverage);
    }

}
