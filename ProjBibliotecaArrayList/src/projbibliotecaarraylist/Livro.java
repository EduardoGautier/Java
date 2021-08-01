package projbibliotecaarraylist;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "\n" 
                + "Título: " + titulo + "\n"
                + "Autor: " + autor + "\n"
                + "Genero: " + genero;
    }
    
    
    
}
