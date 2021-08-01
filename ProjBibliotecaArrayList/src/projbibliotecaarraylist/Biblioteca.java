package projbibliotecaarraylist;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private long cnpj;
    private ArrayList<Livro> listaDeLivros;
    
    public Biblioteca(){
        this.listaDeLivros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Livro> getListaDeLivros() {
        return listaDeLivros;
    }

    public void setListaDeLivros(ArrayList<Livro> listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }

    @Override
    public String toString() {
        return "\n" 
                + "Nome:" + nome + "\n"
                + "Cnpj: " + cnpj + "\n"
                + "Lista de livros: " + listaDeLivros;
    }  
}
