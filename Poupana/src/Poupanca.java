public class Poupanca {
   private double percentualDeRendimento;
   
   public Poupanca(){
       this.percentualDeRendimento = 0.006;
   }

    public double getPercentualDeRendimento() {
        return percentualDeRendimento;
    }

    public void setPercentualDeRendimento(double percentualDeRendimento) {
        this.percentualDeRendimento = percentualDeRendimento;
    }
    
    public int calcularSimulacao(double valorDeposito, double saldoDesejado){
        int meses = 0;
        do{
            valorDeposito += valorDeposito * getPercentualDeRendimento();
            meses++;
        }while(valorDeposito <= saldoDesejado); 
       return meses;
    }
}