package projassociacaovenda;

public class Livro {
    private String titulo;
    private long isbn;
    private String autor;
    private double valor;
    private Data dataLancamento;
    
    public Livro(){
        this.dataLancamento = new Data();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Data getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Data dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "\n"
                + "Titulo: " + titulo + "\n"
                + "Isbn: " + isbn + "\n"
                + "Autor: " + autor + "\n"
                + "Valor: " + valor + "\n"
                + "Data lancamento " + dataLancamento;
    }
    
    
    
    
    
}
