package src;

import org.junit.jupiter.api.Test;
import src.questions.question4.Book;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    @Test
    public void getIsbn_shouldReturnIsbn() {
        var isbn = "a2324423424";
        var book = new Book(isbn, "Title", "Author");
        assertEquals(isbn, book.getIsbn());
    }

    @Test
    public void getTitle_shouldReturnTitle() {
        var title = "Unbreakable";
        var book = new Book("45435535", title, "Non");
        assertEquals(title, book.getTitle());
    }

    @Test
    public void getAuthor_shouldReturnAuthor() {
        var author = "Jordan P";
        var book = new Book("327", "Non", author);
        assertEquals(author, book.getAuthor());
    }

    @Test
    public void  noOfAuthors_shouldReturnNoOfAuthors(){
        var numAuthors = Book.noOfAuthors = 5;
        assertEquals(5,numAuthors);

    }
}
