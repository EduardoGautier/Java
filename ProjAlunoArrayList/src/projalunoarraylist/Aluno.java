package projalunoarraylist;

public class Aluno {
    private String nome;
    private long ra;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getRa() {
        return ra;
    }

    public void setRa(long ra) {
        this.ra = ra;
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
                + "Nome: " + nome + "\n"
                + "Ra: " + ra + "\n"
                + "Sexo: " + sexo;
    }
}
