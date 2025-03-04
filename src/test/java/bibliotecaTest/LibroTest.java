package bibliotecaTest;

import biblioteca.Libro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {
    private Libro libro;
    @Test
    @BeforeEach
    void setUp() {
        libro= new Libro("Harry Potter y la Piedra Filosofal","J.K Rowling", 2000);

        assertEquals("Harry Potter y la Piedra Filosofal", libro.getTitulo());
        assertEquals("J.K Rowling", libro.getAutor());
        assertEquals(2000, libro.getAnioPublicacion());
    }

    @Test
    void getTitulo() {
    }

    @Test
    void setTitulo() {
    }

    @Test
    void getAutor() {
    }

    @Test
    void setAutor() {
    }

    @Test
    void getAnioPublicacion() {
    }

    @Test
    void setAnioPublicacion() {
    }
}