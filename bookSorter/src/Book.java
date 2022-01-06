import javax.rmi.CORBA.StubDelegate;
import java.time.LocalDate;
import java.util.Comparator;

public class Book  {
    private String bookName;
    private int bookPageCount;
    private String authorName;
    private int publishYear;


    public Book(String bookName, int bookPageCount, String authorName, int publishYear){
        this.bookName = bookName;
        this.bookPageCount = bookPageCount;
        this.authorName = authorName;
        this.publishYear = publishYear;
    }

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public int getBookPageCount() {
        return bookPageCount;
    }

    public void setBookPageCount(int bookPageCount) {
        this.bookPageCount = bookPageCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
}
