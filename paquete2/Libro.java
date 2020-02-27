package paquete2;

/**
 *
 * @author mmartinezcosta
 */
public class Libro implements Comparable {

    String titulo;
    String autor;
    String ISBN;
    float prezo;
    int numUnidades;

    public Libro(String titulo, String autor, String ISBN, float prezo, int numUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.numUnidades = numUnidades;
    }

    public Libro() {
    }

    @Override
    public String toString() {
        return "titulo = " + titulo + ", autor = " + autor + ", ISBN = " + ISBN + ","
                + " prezo = " + prezo + ", numUnidades = " + numUnidades + "\n";
    }

    @Override
    public int compareTo(Object o) {
        Libro libro = (Libro) o;
        if (this.titulo.compareToIgnoreCase(libro.titulo) == 0) {
            return 0;
        } else if (this.titulo.compareToIgnoreCase(libro.titulo) > 0) {
            return 1;
        } else {
            return -1;
        }

    }

}
