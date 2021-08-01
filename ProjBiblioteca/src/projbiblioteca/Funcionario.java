package projbiblioteca;

public class Funcionario {
    private String nome;
    private long cpf;
    private String chapa;
    private double salario;
    private Endereco objEndereco;
    
    public Funcionario(){
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

    public String getChapa() {
        return chapa;
    }

    public void setChapa(String chapa) {
        this.chapa = chapa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getObjEndereco() {
        return objEndereco;
    }

    public void setObjEndereco(Endereco objEndereco) {
        this.objEndereco = objEndereco;
    }
    
    @Override
    public String toString(){
        return "\n"
                + "Nome: "+nome+"\n"
                + "Cpf: "+cpf+"\n"
                + "Chapa: "+chapa+"\n"
                + "Salário: "+salario+"\n"
                + "Endereço do funcionário "+this.objEndereco;  
    }
}
