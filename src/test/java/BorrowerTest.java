import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;

    @Before
    public void setUp() {
        borrower = new Borrower(10);
    }

    @Test
    public void borrowedBookCountStartsAtZero() {
        assertEquals(0, borrower.borrowedBookCount());
    }

}
