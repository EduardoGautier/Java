package projbiblioteca;

public class Livro {
    private String titulo;
    private String genero;
    private String autor;
    protected boolean status;

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
    
    public String mostrarStatus(){
        if(this.status){
            return "O livro está indisponível";
        }
        return "O livro está disponível";
    }
    
    @Override
    public String toString(){
        return "\n"
                + "Título: "+titulo+"\n"
                + "Gênero: "+genero+"\n"
                + "Autor: "+autor+"\n"
                + "Mostrar status: "+this.mostrarStatus();
    }  
}
