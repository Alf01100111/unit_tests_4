package seminars.fourth.book;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class BookServiceTest {
    @Test
    void findBookByIdTest () {
        InMemoryBookRepository mockInMemoryBookRep = mock(InMemoryBookRepository.class);
        BookService bookService = new BookService(mockInMemoryBookRep);
        Book testbook = new Book("2");
        when(mockInMemoryBookRep.findById("2")).thenReturn(testbook);
    }

    @Test
    void findAllTest () {
        InMemoryBookRepository mockInMemoryBookRep = mock(InMemoryBookRepository.class);
        BookService bookService = new BookService(mockInMemoryBookRep);
        Book testbook = new Book("2");
        ArrayList<Book> testBooks = new ArrayList<Book>();
        testBooks.add(testbook);
        when(mockInMemoryBookRep.findAll()).thenReturn(testBooks);
    }



}