import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Library library;
    Borrower person;
    Books book;
    Books book1;
    Books book2;
    Books book3;
    Books book4;

    @Before
    public void Before(){
        library = new Library(3);
        book1 = new Books();
        book2 = new Books();
        book3 = new Books();
        book4 = new Books();
        person = new Borrower("Christie");
    }

    @Test
    public void testBorrowBook(){
        library.addNewBook(book1);
        library.addNewBook(book2);
        library.addNewBook(book3);
        library.addNewBook(book4);
        assertEquals(3, library.noOfBooks());
        person.addBook(book);
        assertEquals(2, library.noOfBooks());
        assertEquals(1, person.booksOnShelf());
    }
}
