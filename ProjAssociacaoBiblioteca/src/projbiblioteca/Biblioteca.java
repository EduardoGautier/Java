package projbiblioteca;

public class Biblioteca {
    private String nome;
    private long cnpj;
    private Livro objLivro1;
    private Livro objLivro2;
    
    public Biblioteca(){
        this.objLivro1 = new Livro();
        this.objLivro2 = new Livro();
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

    public Livro getObjLivro1() {
        return objLivro1;
    }

    public void setObjLivro1(Livro objLivro1) {
        this.objLivro1 = objLivro1;
    }

    public Livro getObjLivro2() {
        return objLivro2;
    }

    public void setObjLivro2(Livro objLivro2) {
        this.objLivro2 = objLivro2;
    }

    @Override
    public String toString() {
        return "\nBiblioteca\n" 
                + "Nome: " + nome + "\n"
                + "Cnpj: " + cnpj + "\n"
                + "\nLivro 1 " + objLivro1 + "\n"
                + "\nLivro 2 " + objLivro2;
    }   
}
    

    


    
