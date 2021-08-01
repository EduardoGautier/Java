package projbiblioteca;

public class Livro {
    private String titulo;
    private String genero;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "\n" 
                + "Titulo: " + titulo + "\n"
                + "Genero: " + genero + "\n"
                + "Autor: " + autor;
    }
}
