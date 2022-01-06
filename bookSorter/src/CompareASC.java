import java.util.Comparator;

public class CompareASC implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getBookName().compareTo(book2.getBookName());
    }
}
