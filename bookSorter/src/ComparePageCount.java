import java.util.Comparator;

public class ComparePageCount implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getBookPageCount()-book2.getBookPageCount();
    }
}
