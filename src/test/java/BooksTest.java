import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    Library library;
    Book book;
    Book book2;
    Book book3;


    @Before
    public void setUp() {
        library = new Library(10);
        book = new Book("To Kill a Mockingbird", "Harper Lee", "Classic fiction");
        book2 = new Book("One Hundred Years of Solitude", "Gabrille Garcia Marquez", "Epic fiction");
        book3 = new Book("The Shadow in the Wind", "Carlos Ruiz Zafón", "Mystery fiction");
    }

    @Test
    public void bookHasTitle(){
        library.addBook(book2);
        assertEquals("One Hundred Years of Solitude", book2.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        library.addBook(book);
        assertEquals("Harper Lee", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
    library.addBook(book3);
    assertEquals("Mystery fiction", book3.getGenre());
    }

}
