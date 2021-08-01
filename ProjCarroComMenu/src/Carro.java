public class Carro {
    private String fabricante;
    private String marca;
    private String modelo;
    private String tipo;
    private int anoFabricacao;
    private int potenciaCv;
    private double valorAvista;
    private double taxa;
    private double consumoMedioKmLitro;
    private double qtdDeCombustivel;
    
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public String getFabricante(){
        return this.fabricante;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }
    public int getAnoFabricacao(){
        return this.anoFabricacao;
    }
    public void setPotenciaCv(int potenciaCv){
        this.potenciaCv = potenciaCv;
    }
    public int getPotenciaCv(){
        return this.potenciaCv;
    }
    public void setValorAvista(double valorAvista){
        this.valorAvista = valorAvista;
    }
    public double getValorAvista(){
        return this.valorAvista;
    }
    public void setTaxa(double taxa){
        this.taxa = taxa;
    }
    public double getTaxa(){
        return this.taxa;
    }
    public void setConsumoMedioKmLitro(double consumoMedioKmLitro){
        this.consumoMedioKmLitro = consumoMedioKmLitro;
    }
    public double getConsumoMedioKmLitro(){
        return this.consumoMedioKmLitro;
    }
    public void setQtdDeCombustivel(double qtdDeCombustivel){
        this.qtdDeCombustivel = qtdDeCombustivel;
    }
    public double getQtdDeCombustivel(){
        return this.qtdDeCombustivel;
    }
    public double calcularDistanciaAPercorrer(){
        return this.consumoMedioKmLitro*this.qtdDeCombustivel;
    }
    public double calcularConsumo(double distancia){
        return distancia / this.consumoMedioKmLitro;
    }
    public void abastecer(double valorLitro, double valorTotalAbastecido){
        this.qtdDeCombustivel += valorTotalAbastecido / valorLitro;
    }
    public String toString(){
        return "\n::::::::::::::::::::::::::\nDados do Carro"
                    + "\nFabricante: "+this.fabricante
                    + "\nMarca: "+this.marca
                    + "\nModelo: "+this.modelo
                    + "\nTipo: "+this.tipo
                    + "\nAno de fabricação: "+this.anoFabricacao
                    + "\nPotência cv: "+this.potenciaCv
                    + "\nValor avista: "+this.valorAvista
                    + "\nTaxa: "+this.taxa
                    + "\nConsumo médio por Km litro: "+this.consumoMedioKmLitro
                    + "\nQuantidade de combustível: "+this.qtdDeCombustivel
                    + "\n::::::::::::::::::::::::::\n";
    }
}
