public class Cliente {
    private String nome;
    private long cpf;
    private String rg;
    private String endereco;
    private String email;
    private String telefone;

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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString(){
        return "Nome: "+this.nome + "\n"
               + "Cpf: "+this.cpf + "\n"
               + "Rg: "+this.rg + "\n"
               + "Endereço: "+this.endereco + "\n"
               + "Email: "+this.email + "\n"
               + "Telefone: "+this.telefone;            
    }  
}
