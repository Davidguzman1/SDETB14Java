package class23;

public interface IDataBase {

    void openDatabase();
    void readData();
    void writeData();


}
class IBM implements IDataBase{

    @Override
    public void openDatabase() {
        System.out.println("Opening the IBM Database");
    }
    @Override
    public void readData() {
        System.out.println("Reading the data from IBM Database");
    }
    @Override
    public void writeData() {
        System.out.println("Writing the data to the IBM database");
    }
}

