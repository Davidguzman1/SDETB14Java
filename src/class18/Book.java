package class18;

public class Book {
    private int numOfPages;
    private String color;
    private String genre;
    private String writer;
    private int yearPublished;


    public Book(int numOfPages, String color, String genre) {
        this.numOfPages = numOfPages;
        this.color = color;

        this.genre = genre;
    }

    public Book(String writer, int yearPublished) {
        this.writer = writer;
        this.yearPublished = yearPublished;
    }
    void bookInfo(){
        System.out.println("Number of pages:"+numOfPages+" Book color:"+color+" Genre:"+genre);
    }
    void bookInfo2(){
        System.out.println("Writer:"+writer+" Year Published:"+yearPublished);
    }

    public static void main(String[] args) {
        Book book=new Book(225,"Red","Sci-Fi");
        Book book1=new Book("John Doe",2022);
        book.bookInfo();
        book1.bookInfo2();
    }
}

