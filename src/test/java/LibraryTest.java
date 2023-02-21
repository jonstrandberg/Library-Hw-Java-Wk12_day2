import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book2;
    Book book3;
    Borrower borrower;

    @Before
    public void setUp() {
        library = new Library(10);
        book = new Book ("To Kill a Mockingbird", "Harper Lee", "Classic fiction");
        book2 = new Book ("One Hundred Years of Solitude", "Gabrille Garcia Marquez", "Epic fiction");
        book3 = new Book ("The Shadow in the Wind", "Carlos Ruiz Zafón", "Mystery fiction");
        borrower = new Borrower(3);
    }

    @Test
    public void bookCountStartsAtZero(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book);
        library.addBook(book2);
        library.removeBook(book2);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canLendBook(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.lendBook(borrower, book2);
        assertEquals(2, library.bookCount());
        assertEquals(1, borrower.borrowedBookCount());
    }

    @Test
    public void canAcceptReturnedBooks(){
        library.addBook(book2);
        borrower.borrowBook(book3);
        library.acceptReturnedBook(borrower, book3);
        assertEquals(2, library.bookCount());
        assertEquals(0, borrower.borrowedBookCount());
    }

}
