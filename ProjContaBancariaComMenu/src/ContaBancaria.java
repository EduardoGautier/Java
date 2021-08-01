public class ContaBancaria {
    private int numero;
    private int agencia;
    private double saldo;
    private double limite;
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public int getAgencia(){
        return this.agencia;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setLimite(double limite){
        this.limite = limite;
    }
    public double getLimite(){
        return this.limite;
    }
    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
    }
    public void sacar(double valorDoSaque){
        if(valorDoSaque > this.saldo){
            System.out.println("Não foi possível realizar saque, saldo insuficiente!");
        }else{
            this.saldo -= valorDoSaque;
        }
    }
    public void aumentarLimite(double valorDeAumento){
        this.limite += valorDeAumento;
    }
    public void reduzirLimite(double valorDaReducao){
        if(valorDaReducao > this.limite){
            System.out.println("Não foi possível realizar a redução do limite, pois o limite não pode ficar negativo");
        }else{
            this.limite -= valorDaReducao; 
        }  
    }
    public double mostrarLimite(){
        return this.limite;
    }
    public double mostrarSaldo(){
        return saldo;
    }
}
