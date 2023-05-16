package Zad5_4;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Ebook("Ebook1", "Author1", 200, 1024, "PDF"));
        books.add(new Ebook("Ebook2", "Author2", 150, 512, "EPUB"));
        books.add(new PaperbackBook("Book1", "Author3", 300, 2000));
        books.add(new PaperbackBook("Book2", "Author4", 250, 1998));

        // Sorting the list of books by title
        books.sort(Comparator.comparing(Book::getTitle));

        // Printing the sorted list on the screen
        System.out.println("Sorted list of books:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Page Count: " + book.getPageCount());
            System.out.println();
        }
    }
}
