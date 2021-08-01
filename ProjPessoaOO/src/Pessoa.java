public class Pessoa {
    private String nome;
    private Long cpf;
    private String telefoneCelular;
    private String telefoneResidencial;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }
    
    @Override
    public String toString(){
        return "\nDados\n"
                +"Nome: "+ this.nome + "\n"
                +"Cpf: "+ this.cpf + "\n"
                +"Telefone Celular: "+ this.telefoneCelular + "\n"
                +"Telefone Residêncial: "+ this.telefoneResidencial;
               
    }
    
}
