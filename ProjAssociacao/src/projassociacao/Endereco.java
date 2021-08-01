package projassociacao;

public class Endereco {
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    
    public Endereco(){
        this.complemento = "Casa";
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "\n" 
                + "Rua: " + rua + "\n"
                + "Numero: " + numero + "\n"
                + "Complemento: " + complemento + "\n"
                + "Bairro: " + bairro;
    } 
}
