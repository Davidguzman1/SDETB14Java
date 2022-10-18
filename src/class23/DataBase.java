package class23;

public abstract class DataBase {
    abstract void openDatabase();
    abstract void readData();
    abstract void writeData();
    abstract void closeDatabase();
}
class MicrosoftDataBase extends DataBase{

    @Override
    void openDatabase() {
        System.out.println("Opening the microsoft Database");
    }
    @Override
    void readData() {
        System.out.println("Reading the data from MSDatabase");
    }
    @Override
    void writeData() {
        System.out.println("writing the data to MSDatabase");
    }
    @Override
    void closeDatabase() {
        System.out.println("Closing the MSDatabase");
    }
}
class Oracle extends DataBase{


    @Override
    void openDatabase() {
        System.out.println("Opening the Oracle database");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from Oracle database");
    }

    @Override
    void writeData() {
        System.out.println("Writing the data from Oracle database");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the data from Oracle database");
    }
}



