package class23;
interface File1{
    void edit();
    void close();
}
public abstract class File implements File1{
   public abstract void open();
}
class JavaFile extends File implements File1{

    @Override
    public void open(){
        System.out.println("Opened Java file with notepad++");
    }

    @Override
    public void edit() {
        System.out.println("Editing Java file");
    }

    @Override
    public void close() {
        System.out.println("Closing Java File");
    }
}
class WordFile extends File implements File1{

    @Override
    public void open(){
        System.out.println("Opening Word file with Microsoft Word");
    }

    @Override
    public void edit() {
        System.out.println("Editing Word file");
    }

    @Override
    public void close() {
        System.out.println("Closing Word file");
    }
}
class PdfFile extends File implements File1{

    @Override
    public void open(){
        System.out.println("Opening Pdf file with adobe");
    }

    @Override
    public void edit() {
        System.out.println("Editing Pdf file");
    }

    @Override
    public void close() {
        System.out.println("Closing Pdf file");
    }
}
class FileTester{
    public static void main(String[] args) {
        File[] file={new JavaFile(),new PdfFile(),new WordFile()};
        for(File file2:file){
            file2.open();
            file2.edit();
            file2.close();
        }

    }
}