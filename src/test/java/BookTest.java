import org.example.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BookTest {

    @Test
    void shouldThrowExceptionWhenInvalidValueInSetter() {
        Book book = new Book(1, "Valid name", "Valid author", 123);

        assertThrows(IllegalArgumentException.class, () -> {
            book.setPages(-1);
        });
    }

    @Test
    void shouldThrowExceptionWhenInvalidConstructorData() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Book(-1, "", "", -1);
        });
    }
}
