import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return books.size();
    }


    public void addBook(Book book) {
        if (this.bookCount() < this.capacity) {
            this.books.add(book);
        }
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public void lendBook(Borrower borrower, Book book) {
        if (borrower.borrowedBookCount() < borrower.getCapacity()) {
            removeBook(book);
            borrower.borrowBook(book);
        }
    }

    public void acceptReturnedBook(Borrower borrower, Book book) {
        if (borrower.returnedBook(book)) {
            addBook(book);
        }
    }
}

