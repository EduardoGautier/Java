public class SimuladorDePoupanca {
   private double percentualDeRendimento;

    public double getPercentualDeRendimento() {
        return percentualDeRendimento;
    }

    public void setPercentualDeRendimento(double percentualDeRendimento) {
        this.percentualDeRendimento = 0.006;
    }
    
    public int calcularSimulacao(double valorDeposito, double saldoDesejado){
        int meses = 0;
        do{
            valorDeposito+= valorDeposito*0.006;
            meses++;
        }while(valorDeposito <= saldoDesejado);
       return meses;
    }
}
