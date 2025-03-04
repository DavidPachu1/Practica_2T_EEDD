package bibliotecaTest;

import biblioteca.Biblioteca;
import biblioteca.Libro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {
    Biblioteca biblioteca;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    void agregarLibro() {
        Libro libro = new Libro("Harry Potter y la Camara de los Secretos", "J.K Rowling", 2003);
        biblioteca.agregarLibro(libro);

        assertTrue(biblioteca.getLibros().contains(libro));
        assertEquals(1, biblioteca.getLibros().size(), "La biblioteca debería tener un libro");
    }

    @Test
    void eliminarLibro() {
        Libro libro = new Libro("Harry Potter 3", "J.K Rowling", 2006);
        biblioteca.eliminarLibro(libro);

        assertTrue(biblioteca.getLibros().contains(libro));
        assertEquals(0, biblioteca.getLibros().size(), "La biblioteca debería estar vacía");
    }

    @Test
    void getLibros() {
    }

    @Test
    void testEncuentraLibroPorTitulo_Existe() {
        Libro libro = new Libro("Harry Potter y la Camara de los Secretos", "J.K Rowling", 2003);
        biblioteca.agregarLibro(libro);

        Libro encontrado = biblioteca.encuentraLibroPorTitulo("1984");

        assertNotNull(encontrado, "El libro debería encontrarse en la biblioteca");
        assertEquals("Harry Potter y la Camara de los Secretos", encontrado.getTitulo(),
                "El título del libro encontrado no coincide");
    }

    @Test
    void testEncuentraLibroPorTitulo_NoExiste() {
        Libro encontrado = biblioteca.encuentraLibroPorTitulo("Libro erróneo");

        assertNull(encontrado, "El método debería devolver null si el libro no existe");
    }

    @Test
    void testEncuentraLibrosPorAutor_Existe() {
        Libro libro1 = new Libro("Palotes", "Michael Jordan", 2010);
        Libro libro2 = new Libro("Gallinas", "Michael Jordan", 2014);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Buscar libros del autor "George Orwell"
        List<Libro> encontrados = biblioteca.encuentraLibrosPorAutor("Michael Jordan");

        assertNotNull(encontrados, "La lista no debería ser null");
        assertEquals(2, encontrados.size(), "Debería encontrar dos libros del autor");
        assertTrue(encontrados.contains(libro1), "La lista debería contener 'Palotes'");
        assertTrue(encontrados.contains(libro2), "La lista debería contener 'Gallinas'");
    }

    @Test
    void testEncuentraLibrosPorAutor_NoExiste() {
        List<Libro> encontrados = biblioteca.encuentraLibrosPorAutor("Autor Desconocido");

        assertNull(encontrados, "El método debería devolver null si no hay libros del autor");
    }

}