import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

        private Books book1;
        private Books book2;
        private Books book3;
        private Books book4; //if it has a capital it is a class. if it has a lower case, it is the name of the instance.
        // They do not have to match though!
        private Library library;
        private Books book;

        //def setup
        @Before
        public void Before(){
            book1 = new Books();
            book2 = new Books();
            book3 = new Books();
            book4 = new Books();
            library = new Library(3);
//            library.addNewBook(book1);
//            library.addNewBook(book2);
//            library.addNewBook(book3);
//            library.addNewBook(book4);
        }

        @Test
        public void checkStartsEmpty(){
            assertEquals(0, library.noOfBooks());
        }

        @Test
        public void canAddNewBook(){
            library.addNewBook(book);
            assertEquals(1, library.noOfBooks());
        }

        @Test
        public void canRemoveBook(){
            library.addNewBook(book);
            assertEquals(1, library.noOfBooks());
            library.removeBook();
            assertEquals(0, library.noOfBooks());
        }

        @Test
        public void testCapacity(){
            library.addNewBook(book);
            library.addNewBook(book);
            library.addNewBook(book);
            library.addNewBook(book);
            assertEquals(3, library.noOfBooks());
        }

        }
