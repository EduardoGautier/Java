package projassociacao;

public class Cliente {
    private String nome;
    private long cpf;
    private Endereco objEndereco;
    
    public Cliente(){
        this.objEndereco = new Endereco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Endereco getObjEndereco() {
        return objEndereco;
    }

    public void setObjEndereco(Endereco objEndereco) {
        this.objEndereco = objEndereco;
    }

    @Override
    public String toString() {
        return "\n" 
                + "Nome: " + nome + "\n"
                + "Cpf: " + cpf + "\n"
                + "\nEndereco: " + objEndereco;
    }   
}
