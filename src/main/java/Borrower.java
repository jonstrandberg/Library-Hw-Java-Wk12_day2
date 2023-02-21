import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowedBooks;
    private int capacity;

    public Borrower(int capacity) {
        this.borrowedBooks = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }


    public int borrowedBookCount() {
        return borrowedBooks.size();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public boolean returnedBook(Book book) {
        return borrowedBooks.remove(book);
    }

}
