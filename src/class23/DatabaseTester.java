package class23;

public class DatabaseTester {
    public static void main(String[] args) {
        DataBase dataBase=new MicrosoftDataBase();
        dataBase.openDatabase();
        dataBase.readData();
        dataBase.writeData();
        dataBase.closeDatabase();
    }
}
