public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double calcularMedia(){
        return (nota1+nota2)/2;
    }
    public String verificarConceito(){
        if(this.calcularMedia() >9){
            return "A";
        }else if(this.calcularMedia() >=8 && this.calcularMedia() <9){
            return "B";
        }else if(this.calcularMedia() >=6 && this.calcularMedia() <8){
            return "C";
        }
            return "D";
    }
    @Override
    public String toString(){
        return "\nDados do Aluno" +"\n"
               +"Nome: "+this.nome +"\n"
               +"Nota 1: "+this.nota1 +"\n"
               +"Nota 2: "+this.nota2 +"\n"
               +"Média: "+this.calcularMedia() +"\n"
               +"Conceito: "+this.verificarConceito();
    }
}
