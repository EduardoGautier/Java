

public class Pessoa {
    private double altura;
    private byte sexo;
    private double pesoAtual;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public byte getSexo() {
        return sexo;
    }

    public void setSexo(byte sexo) {
        this.sexo = sexo;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }
    

    public double calcularPesoIdeal(){
        if(sexo == 1){
            return (72.7 * altura) - 58;
        }else{
            return (62.1 * altura) - 44.7;
        }       
    }
    public String verificarPeso(){
        if(pesoAtual < this.calcularPesoIdeal()-2){
            return "kg, e você está abaixo do peso";
        }
            return "kg, e você está acima do peso";
    }
    @Override
    public String toString(){
        return "\nAnalise do Peso\n\n"
                + "Altura: "+this.altura +"\n"
                + "Sexo: "+this.sexo +"\n"
                + "Peso atual "+this.pesoAtual + " "+this.verificarPeso() +"\n"
                + "O peso ideal para você é: "+this.calcularPesoIdeal() +" kg";
    }  
}
