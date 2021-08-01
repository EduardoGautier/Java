package projhotel;

public class Hospede {
    private String nome;
    private long cpf;
    private String sexo;

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "\n"
                + "\nNome: " + nome + "\n"
                + "Cpf: " + cpf + "\n"
                + "Sexo: " + sexo;
    }
}
