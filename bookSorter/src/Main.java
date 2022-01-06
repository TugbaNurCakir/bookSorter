import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", 20, "Tugba", 2018);
        Book book2 = new Book("The Great Gatsby",120,"Eray",1992);
        Book book3 = new Book("Nineteen Eighty Four",55, "Nur", 1779);
        Book book4 = new Book("Anna Karenina",89,"Ceren",1999);
        Book book5 = new Book("The Stranger",93,"Can",2003);

        TreeSet<Book> bookSet = new TreeSet<>(new ComparePageCount());
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);


        TreeSet<Book> bookSet1 = new TreeSet<>(new CompareASC());
        bookSet1.add(book1);
        bookSet1.add(book2);
        bookSet1.add(book3);
        bookSet1.add(book4);
        bookSet1.add(book5);

        for(Book b: bookSet){
            System.out.println(b.getBookName() + " "+b.getBookPageCount());
        }
        System.out.println("----------");
        for(Book b1: bookSet1){
            System.out.println(b1.getBookName());
        }
    }
}
