package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    // TODO: Documentar estos atributos
    /**
     * Lista de libros que contiene la biblioteca.
     * Se inicializa en el constructor y almacena objetos de tipo {@link Libro}.
     */
    private final List<Libro> libros;

    // TODO: Documentar este método

    /**
     * Crea una nueva biblioteca vacia
     * Inicializa la biblioteca nueva con un ArrayList
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO

    /**
     * Crea una biblioteca con una lista de libros
     * Permite inicializar la biblioteca con dicha lista de libros
     *
     * @param libros de la lista
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado

    /**
     * Agrega un libro a la biblioteca.
     *
     * @param libro El que se desea agregar a la biblioteca.
     * @return {@code true} si el libro se agregó correctamente, {@code false} en caso negativo.
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado

    /**
     * Elimina un libro a la biblioteca
     *
     * @param libro que se desea eliminar de la biblioteca
     * @return {@code true} si el libro se elimino correctamente, {@code false} en caso contrario
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método

    /**
     * Obtiene la lista de libros en la biblioteca
     *
     * @return lista de libros actualmente o disponibles
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.

    /**
     * Busca libros por su titulo
     *
     * @param titulo que se desea buscar
     * @return el libro buscado o {@code null} si no se encuentra
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo

    /**
     * Este metodo esta obsoleto, se recomienda usar {@link #encuentraLibrosPorAutor(String autor)}
     * para obtener la lista
     *
     * @param autor del libro que se quiere buscar
     * @return libro del autor especificado si existe, o {@code null} si no se encuentra.
     * @deprecated Usar {@link #encuentraLibrosPorAutor(String autor)} en su lugar.
     */
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente

    /**
     * Busca todos los libros en la biblioteca que fueron escritos por un autor específico.
     * Este metodo sustituye a {@link #encuentaLibroPorAutor(String)}, ya que devuelve una lista
     * completa de libros
     *
     * @param autor cuyos libros se desean buscar.
     * @return Una lista de libros del autor especificado. Si no hay coincidencias, {@code null}.
     * @since 2.0
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
