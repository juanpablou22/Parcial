package pk01;

public class Libro {

    private String titulo;
    private String autor;
    private int ejemplares;
    private int ejemplaresPrestados;

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.ejemplares = 0;
        this.ejemplaresPrestados = 0;
    }

    public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public boolean prestar() {
        if (ejemplares > ejemplaresPrestados) {
            ejemplaresPrestados++;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (ejemplares > 0) {

            ejemplaresPrestados--;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Titulo:" + titulo + ",Autor:" + autor + "Ejemplares:" + ejemplares + "Ejemplares Prestados:" + ejemplaresPrestados;
    }
}
