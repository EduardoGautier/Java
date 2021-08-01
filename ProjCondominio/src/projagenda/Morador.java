package projagenda;

public class Morador {
    private String nome;
    private int NumeroAp;
    private int ValorAp;
    private String Pago;
    
    public Morador(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroAp() {
        return NumeroAp;
    }

    public void setNumeroAp(int NumeroAp) {
        this.NumeroAp = NumeroAp;
    }

    public int getValorAp() {
        return ValorAp;
    }

    public void setValorAp(int ValorAp) {
        this.ValorAp = ValorAp;
    }

    public String getPago() {
        return Pago;
    }

    public void setPago(String Pago) {
        this.Pago = Pago;
    }





    @Override
    public String toString() {
        return "\n"
                + "Nome: " + nome + "\n"
                + "Numero Apartamento: " + NumeroAp + "\n"
                + "valor do condominio: "+ValorAp+"\n"
                + "O Condominio esta pago(S/N): "+Pago;
    }
    
}
