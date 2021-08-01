package projalunoassociacao;

public class Aluno {
    private String nome;
    private long ra;
    private Avaliacao objAvaliacao1;
    private Avaliacao objAvaliacao2;
    
    public Aluno(){
        this.objAvaliacao1 = new Avaliacao();
        this.objAvaliacao2 = new Avaliacao();
    }

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

    public Avaliacao getObjAvaliacao1() {
        return objAvaliacao1;
    }

    public void setObjAvaliacao1(Avaliacao objAvaliacao1) {
        this.objAvaliacao1 = objAvaliacao1;
    }

    public Avaliacao getObjAvaliacao2() {
        return objAvaliacao2;
    }

    public void setObjAvaliacao2(Avaliacao objAvaliacao2) {
        this.objAvaliacao2 = objAvaliacao2;
    }
    
    public double calcularMedia(){
        return (this.objAvaliacao1.getNota()+this.objAvaliacao2.getNota())/2;
    }
    
    public String toString(){
        return "Dados do aluno\n"
                +"Nome: "+nome+"\n"
                +"Ra: "+ra+"\n"
                +"\nAvaliação 1"+objAvaliacao1+"\n"
                +"\nAvaliação 2"+objAvaliacao2+"\n"
                +"\nMédia: "+this.calcularMedia();
        
    }
}
